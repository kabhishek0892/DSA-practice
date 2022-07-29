#!/bin/bash
# shellcheck disable=SC2034

##############################################################################
### VARs

SCRIPT_LOCATION=$(dirname "$0")
#LAST_CHECK_DATE_FILE="$SCRIPT_LOCATION/../data/toolkit_last_check_date.txt"
TEMPORARY_FILE="/private/tmp/mobile-toolkit-cache"

REGEX_NUMBER='^[0-9]+$'

##############################################################################
### Android

android_check_connected(){
  android_get_devices
  #No device connected
  if [ ${#DEVICES[@]} -eq 0 ]
  then
    echo "❌ No Android devices detected"
    exit 1
  fi
}

android_wait_for_device(){
  echo "⏳ Waiting for Android device..."
  adb wait-for-any-device
  android_get_devices
}

android_get_devices_auth_dump(){
  DEVICES_DUMP="$SCRIPT_LOCATION/toolkit_adb_devices_dump.txt"
  rm -f $DEVICES_DUMP
  adb devices | grep -v "List" >> $DEVICES_DUMP
  if cat "$DEVICES_DUMP" | grep -q unauthorized ; then
    read -r -p $'🚨 Unauthorized Android device detected!\n🔌 Reconnect it, allow USB debugging and press ENTER...'
    android_get_devices_auth_dump
  fi
  if cat "$DEVICES_DUMP" | grep -q offline ; then
    read -r -p $'🚨 Offline Android device detected!\n🔌 Wait until the startup is complete, then press ENTER...'
    android_get_devices_auth_dump
  fi
}

android_get_devices(){
  #Populate array with device ids
  DEVICES=()
  android_get_devices_auth_dump
  for LINE in $(cat $DEVICES_DUMP | awk '{print $1}')
  do
    DEVICE=$(echo "$LINE" | awk '{print $1}')
    DEVICES+=("$DEVICE")
  done
}

android_get_device_sdk(){
  SDK=$(adb -s "$1" shell getprop ro.build.version.sdk | tr -cd '[[:alnum:]]._-')
}

android_device_info(){
  MANUFACTURER=$(adb -s "$1" shell getprop ro.product.manufacturer | tr -cd '[[:alnum:]]._-')
  MODEL=$(adb -s "$1" shell getprop ro.product.model | tr -cd '[[:alnum:]]._-')
  VERSION=$(adb -s "$1" shell getprop ro.build.version.release | tr -cd '[[:alnum:]]._-')
  SDK=$(adb -s "$1" shell getprop ro.build.version.sdk | tr -cd '[[:alnum:]]._-')
  INFO=$(printf "%s) %s %s %s (API %s) - %s" "$NUMBER" "$MANUFACTURER" "$MODEL" "$VERSION" "$SDK" "$1")
}

android_choose_device() {
  check_adb_dependency
  android_check_connected

  #Gather device info and choose device
  if [ ${#DEVICES[@]} -gt 1 ]
  then
    NUMBER=1
    echo "📱 Available devices:"
    for ID in "${DEVICES[@]}"
    do
      android_device_info "$ID"
      echo "$INFO"
      ((NUMBER++))
    done

    read -r -p "📝 Select a device: " CHOICE
    while :;
    do
    if [[ ! $CHOICE =~ $REGEX_NUMBER ]] || [ "$CHOICE" -le "0" -o "$CHOICE" -gt "${#DEVICES[@]}" ]; then
      echo -en "\033[1A\033[2K" #deletes last echoed line in terminal
      read -r -p "🤷 Invalid input, try again: " CHOICE
    else
      break
    fi
    done
    SELECTED_DEVICE=${DEVICES[(($CHOICE-1))]}
else
  SELECTED_DEVICE="${DEVICES[0]}"
fi

SELECTED_DEVICE_MODEL=$(adb -s "$SELECTED_DEVICE" shell getprop ro.product.model | tr -cd '[[:alnum:]]._-')
SELECTED_DEVICE_SDK=$(adb -s "$SELECTED_DEVICE" shell getprop ro.build.version.sdk | tr -cd '[[:alnum:]]._-')
}

android_device_unlocked(){
  echo "📱 Checking screen status..."
  adb -s "$1" shell dumpsys power | grep "mWakefulness=" | grep "Awake" &> /dev/null
  return $?
}

android_get_foreground_package(){
  android_get_device_sdk "$SELECTED_DEVICE"
  if (( "$SDK" < 21 )); then
    android_get_foreground_package_sdk_low
  elif (( "$SDK" < 30 )); then
    android_get_foreground_package_sdk_21_plus
  elif (( "$SDK" < 31 )); then
    android_get_foreground_package_sdk_30_plus
  else
    android_get_foreground_package_sdk_31_plus
  fi
}

android_get_foreground_package_sdk_31_plus(){
  adb -s "$SELECTED_DEVICE" shell dumpsys activity recents | grep 'Recent #0' | cut -d= -f3 | cut -d ':' -f2 | cut -d ' ' -f1
}

android_get_foreground_package_sdk_30_plus(){
  adb -s "$SELECTED_DEVICE" shell dumpsys activity recents | grep 'Recent #0' | cut -d= -f6 |  cut -d ':' -f2 | cut -d ' ' -f1
}

android_get_foreground_package_sdk_21_plus(){
  adb -s "$SELECTED_DEVICE" shell dumpsys activity recents | grep 'Recent #0' | cut -d= -f2 | sed 's| .*||' | cut -d '/' -f1
}

android_get_foreground_package_sdk_low(){
  adb -s "$SELECTED_DEVICE" shell dumpsys window windows | grep mCurrentFocus | cut -d'/' -f1 | rev | cut -d' ' -f1 | rev
}

android_get_storage_location_per_SDK(){
  if (( "$1" < 30 )); then
    DEVICE_FILE_PATH="/mnt/sdcard"
  else
    DEVICE_FILE_PATH="/storage/self/primary"
  fi
}

android_is_package_installed() {
  adb -s "$SELECTED_DEVICE" shell pm list packages -f | sed -e 's/.*=//' | grep -w "$1" &> /dev/null
  EXIT_CODE=$?
  if [ $EXIT_CODE -ne 0 ]; then
    echo "🤷‍ Package \"$1\" is not installed"
    exit 1
  fi
}

android_detect_package_info(){
  echo "🔍 Detecting package name..."
  AAPPT_PATH=$(find ~/Library/Android/sdk -name 'aapt' | sort | tail -1)
  PACKAGE_INFO=$($AAPPT_PATH dump badging "$1" > $TEMPORARY_FILE)
  PACKAGE_NAME=$(cat $TEMPORARY_FILE | grep package:\ name);
  PACKAGE_NAME=$(echo "$PACKAGE_NAME" | sed 's/^[^'\'']*'\''//');
  PACKAGE_NAME=$(echo "$PACKAGE_NAME" | sed 's/'\''.*//');
  APP_NAME=$(cat $TEMPORARY_FILE  | grep application-label:)
  APP_NAME=${APP_NAME#"application-label:"}
}

android_unlock_device(){
  # arg1 = DEVICE_ID
  # arg2 = MAX_RETRIES
  MAX_RETRIES="$2"
  UNLOCK_RETRIES=1
until android_device_unlocked "$1";
do
    if [ "$UNLOCK_RETRIES" -le "$MAX_RETRIES" ]; then
      echo "🔆 Screen on attempt $UNLOCK_RETRIES..."
      ((UNLOCK_RETRIES++));
      adb -s "$1" shell input keyevent KEYCODE_POWER
      adb -s "$1" shell input keyevent 82
      sleep 1;
   else
      read -r -p "❌ Screen-wake failed, press ANY KEY after manual unlock..."
      break
   fi
 done

 delete_lastline
 echo "📱 Screen unlocked..."
}


##############################################################################
### Commons

check_adb_dependency(){
  if ! [ -x "$(command -v "adb")" ]; then
    echo "🤷‍ Android Debug Bridge required!"
    should_proceed "🔄 Install via homebrew? (this may take a while)"
    brew install --cask "android-platform-tools"
  fi
}

check_dependency(){
  if ! [ -x "$(command -v "$1")" ]; then
    echo "💥 \"$1\" command required!"
    should_proceed "🛒 Install via homebrew? (this may take a while)"
    brew install "$1"
  fi
}

  cd "$CURRENT_DIR" || exit


delete_lastline(){
  echo -en "\033[1A\033[2K"
}

yes_or_no(){
  read -r -n 1 -p "$1 [y/n] " RESPONSE
  case "$RESPONSE" in
      [yY])
          ;;
      [nN])
          ;;
      *)
        echo
        echo "🤷‍ Invalid option"
        yes_or_no "$1"
        ;;
  esac
  echo
}

should_proceed(){
  read -r -n 1 -p "$1 [y/n] " RESPONSE
  case "$RESPONSE" in
    [yY])
      ;;
    *)
      exit
      ;;
  esac
  echo
}

choose_number(){
  MAX=$1
  if [ -n "$2" ]; then
    read -r -p "$2" CHOICE
  else
    read -r -p "📝 Choose number: " CHOICE
  fi
  while :;
  do
    if [[ -z $CHOICE  || $CHOICE -le 0 || $CHOICE -gt $MAX ]]; then
      delete_lastline
      read -r -p "🤷‍ Invalid choice, try again: " CHOICE
    else
      ((++CHOICE))
      break
    fi
  done
}

check_url(){
  URL=$1

  if [[ $URL == "" ]]; then
    read -r -p "📝 Insert web url: " URL
    check_url "$URL"
  else
    case $1 in
      'http://'*)
        ;;
      'https://'*)
        ;;
      *'://'*)
        ;;
      *)
        URL='http://'$URL
        ;;
    esac
  fi
}

abort(){
  echo "$1"
  exit 1
}