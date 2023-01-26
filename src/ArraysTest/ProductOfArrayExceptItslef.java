package ArraysTest;

import java.util.Arrays;

public class ProductOfArrayExceptItslef {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
      //  System.out.println(Arrays.toString(productExceptSelf(arr)));

        System.out.println(Arrays.toString(productExceptSelfBasic(arr)));

    }

    static  int[] productExceptSelfBasic(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];

        for (int i =0;i<n;i++){
            int product =1;
// leave index i
            for( int j= 0;j<i;j++){
                product = product * nums[j];
            }
            for( int j= i+1;j<n;j++){
                product = product * nums[j];
            }
            output[i] = product;
        }
        return output;
    }
    static public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int [] prefix = new int[n];

        //pre compute prexif
        //Prefix[i] = product of all elements to left of i
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        int [] suffix = new int[n];
        //pre compute suffix
        //Suffix[i] = product of all elements to right of i

        suffix[n-1] =1;
        for (int i=n-2;i>=0;i--)
        {
            suffix[i] =suffix[i+1] * nums[i+1];
        }

        for(int i=0;i<n;i++){
            output[i] = prefix[i]* suffix[i];
        }
        return output;
    }
}
