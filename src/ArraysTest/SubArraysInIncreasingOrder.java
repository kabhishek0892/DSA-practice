package ArraysTest;

import java.util.ArrayList;
import java.util.List;

public class SubArraysInIncreasingOrder {

    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>();
        int[] nums = {10,4,6,8,2,4,7,4,8,9};
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 1; i < nums.length ; i++) {
            if (nums[i - 1] < nums[i]) {
                al.add(nums[i -1]);
            }
            result.add(al);

        }
        System.out.println(result);
    }
   // int [] o/p = [10,[4,6,8],[2,4,7][4,8,9]]
}
