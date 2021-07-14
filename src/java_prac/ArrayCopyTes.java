package java_prac;

import java.util.Arrays;

public class ArrayCopyTes {

    public static void main(String[] args) {
        int a[] = { 1, 8, 3 };
        int c[] = { 5, 6, 7};

        // Create an array b[] of same size as a[]
        int b[] = new int[a.length+c.length];

        // Copy elements of a[] to b[]
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];

        System.out.println(Arrays.toString(b));
    }
}
