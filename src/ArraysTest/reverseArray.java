package ArraysTest;

import java.util.Arrays;

public class reverseArray {

   static  void swap (int i , int j ,int arr[]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    // if reversing from kth position to end then start will be k
    public static void main(String[] args) {
        int arr[] = {4,7,3,9,13,18,1};
        int start =0;
        int end =arr.length-1;

        while (start<=end){

            swap (start, end,arr);
            start++;
            end--;
        }
        System.out.println("Reversed array is "+ Arrays.toString(arr));
    }

}
