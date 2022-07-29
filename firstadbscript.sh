echo "I am inside the adb script"
adb devices
adb install /Users/mmt9361/Downloads/makemytrip-8-7-4.apk
adb shell monkey -p com.makemytrip -v 1000 > app_log.txt
