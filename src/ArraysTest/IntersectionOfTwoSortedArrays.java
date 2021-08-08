package ArraysTest;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {

        int arr1[] = {2, 3, 4, 5, 7, 12};
        int arr2[] = {4, 10, 12};
        int len1 = arr1.length;
        int len2 = arr2.length;

        IntersectionOftwoSortedArray(arr1, arr2, len1, len2);

    }

    static void IntersectionOftwoSortedArray(int arr1[], int arr2[], int m, int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] > arr2[j]) {
                j++;
            }
            if (arr1[i] < arr2[j]) {
                i++;
            }
            if (arr1[i] == arr2[j]) {


                al.add(arr1[i]);
                i++;
                j++;
            }

        }
        Object[] objects = al.toArray();
        System.out.println(Arrays.toString(objects));

    }

}