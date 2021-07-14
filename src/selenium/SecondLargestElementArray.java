package selenium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SecondLargestElementArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 2, 5, 14, 12, 7, 18,13};

       /* Arrays.sort(arr);
        System.out.println(arr[arr.length -2]);*/
//for(int i : 1 --> 18 ) -- >
        int[] nums = { 11, 1, 10 };

        int max = 0;
        int secmax = 0;

        for(int x=0; x<nums.length; x++) {
            if(nums[x]>max ) {
                secmax = max;
                max=nums[x];
            }
             else if(nums[x]>secmax){
                secmax=nums[x];
            }
        }
        System.out.println("1st H value: " + max);
        System.out.println("2nd H Value: " + secmax);
    }

}
