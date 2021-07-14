package String;

import java.util.Arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        String[] arr = {"Punjab", "Haryana", "PAssam"};
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareToIgnoreCase(arr[i]) > 0) {
                System.out.println("String array is not sorted");
                break;
            } else {
                System.out.println("String array is sorted");
                break;
            }
        }

        //Check that Element of array is sorted or not

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int arr1[] = {5, 1, 4, 9, 2, 8, 3};
        int temp;

        for (int i = 0; i < arr1.length; i++)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr1[i] > arr1[j]) {
                    temp = arr1[i]; //5

                    arr1[i] = arr1[j]; //arr[i]=1

                    arr1[j] = temp; //5
                }

            }
        System.out.println(Arrays.toString(arr1));
    }
}
