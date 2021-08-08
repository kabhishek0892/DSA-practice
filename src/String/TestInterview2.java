package String;

import java.util.Arrays;

public class TestInterview2 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 9, 11};
        //Find 9
        int x = 9;
        int start = 0;
        int end = a.length - 1;

        for (int b = start; b < end; b++) {
            if (a[(start + end) / 2] == x) {
                System.out.println("Found the" + x);
            } else if (a[(start + end) / 2] > x) {
                start = (start + end) / 2;
            } else if (a[(start + end) / 2] < x) {
                end = (start + end) / 2;
            }

        }


    }}

