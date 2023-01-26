package ArraysTest;

import java.util.Arrays;

public class ReverseArrayInGroupSizeK {

    //Reverse an array in groups of given size
//    Input:
//    arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
//    k = 3
//    Output:
//            [3, 2, 1, 6, 5, 4, 9, 8, 7]
//
//    Input:
//    arr = [1, 2, 3, 4, 5, 6, 7, 8]
//    k = 5

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int size = 3;
        reverse(arr,size);

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);

        }
    }
    static void reverse(int[] arr, int grpsize){
        for(int i =0 ;i<arr.length;i+=grpsize){
            int left = i;
            int right =Math.min(i + grpsize - 1, arr.length - 1);
            int temp;
            while(left<right){
                temp =arr[left];
                arr[left] =arr[right];
                arr[right]=temp;
                left+=1;
                right-=1;

            }
        }
    }
}
