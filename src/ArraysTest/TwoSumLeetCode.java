package ArraysTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumLeetCode {
    public static void main(String[] args) {
        int a[]={2,7,11,15};
        int sum = 18;
        int[] b =  twoSumsUsingHashMap(a,sum);
        System.out.println(Arrays.toString(b));



    }
//using brut force
   /* static int[] twoSums(int[] nums , int sum){
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+ nums[j]==sum)
                {
                    return new int[]{i,j};
                }
            }
        }

        throw new IllegalArgumentException("Not found");
    }*/

    //Using HashMap

    static int[] twoSumsUsingHashMap(int arr[], int sum)
    {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],i);
        }
        System.out.println(hm);
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(sum-arr[i]))
            {
                return new int[]{i,hm.get(sum-arr[i])};
            }
        }
     throw new IllegalArgumentException("No not found");
    }
}
