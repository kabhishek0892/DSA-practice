package java_prac;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main (String[] args)
    {
        int[] arr1 = {-5, 3, 6, 12, 15};
        int n1 = arr1.length;

        int[] arr2 = {-12, -10, -6, -3, 4, 10};
        int n2 = arr2.length;

        int[] arr3 = new int[n1+n2];

        mergeArrays(arr1, arr2, n1, n2, arr3);

        System.out.println("Array after merging");
        for (int i=0; i < n1+n2; i++)
            System.out.print(arr3[i] + " ");
    }


    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {

       int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(arr1[i]>arr2[j])
            {
             arr3[k++]=arr2[j++];

            }
            else
                {
                arr3[k++]=arr1[i++];
                }
        }
        System.out.println( "Value of i is"+i);
        System.out.println( "Value of j is"+j);
        while (i < n1)
            arr3[k++] = arr1[i++];

        // Store remaining elements of second array
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
    }



