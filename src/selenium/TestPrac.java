package selenium;

import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
//
//
//
//Example 1:
//
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
//Example 2:
//
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
//Example 3:
//
//Input: nums = [3,3], target = 6
//Output: [0,1]
public class TestPrac {

  static int[] sumCheck(int nums[], int target){
      Map<Integer,Integer> hm = new HashMap<>();
      for(int i = 0;i<nums.length;i++)
      {
          int remainder = target - nums[i];

              if(hm.containsKey(remainder))
              {
                 return new int[]{hm.get(remainder),i};
              }
          hm.put(nums[i],i);
      }
      throw new IllegalArgumentException("No two sum solution");
  }
    public static void main(String[] args) {
    int[] n={1,5,7,9};
    int x =n[n.length -1];
        System.out.println(x);
   ++ x;
        n[n.length -1]=x;
        System.out.print( n[n.length -1]);
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i]);
        }

    sumCheck(n,12);

    }
}
