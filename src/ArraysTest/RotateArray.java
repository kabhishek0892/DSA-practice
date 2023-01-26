package ArraysTest;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;

public class RotateArray {

    public static String encodeTextSHA256(String str) throws NoSuchAlgorithmException
    {
        byte[] data = str.getBytes(StandardCharsets.UTF_8);
        MessageDigest digester = MessageDigest.getInstance("SHA-256");
        digester.update(data);
        return Base64.getEncoder().encodeToString(digester.digest()); }

  public void rotateRight(int nums[],int k){
    reverse(nums,0,nums.length-1);
    reverse(nums,0,k-1);
    reverse(nums,k,nums.length-1);

}
//{3,5,7,9,1,6,8} --> 1,6,8,3,5,7,9
    //8,6,1,9,7,5,3
public void rotateLeft(int nums[],int k){
    reverse(nums,0,nums.length-1);
   reverse(nums,0,k-1);
    reverse(nums,nums.length-1,nums.length-1-k);
}

    private void reverse(int[] nums, int start, int end) {
    while(start<end){
        int temp =nums[start];
        nums[start] =nums[end];
        nums[end] =temp;
        start++;
        end --;

    }
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        int n[] = {3,5,7,9,1,6,8}; //

        int k = 4;

        RotateArray right = new RotateArray();
       // right.rotateRight(n,k);

        RotateArray left = new RotateArray();
        right.rotateLeft(n,k);

        System.out.println(encodeTextSHA256("DavbpyhE"));


        //Rotate the given array by k times toward left

      /*  for(int i=0;i<k;i++)
        {
            int j,first,last; //Stores the first element of the array
            //first =n[0];
            last=n[n.length-1]; ////Stores the last element of the array
          //  for(j=0;j<n.length-1;j++) // Left rotation
            for(j=n.length-1;j>0;j--) //Right rotation
            {
                //n[j] = n[j+1]; // to rotate left
                n[j] = n[j-1]; //to rotate right
            }
           //n[j]=first;  //First element of array will be added to the end
            n[0] = last; ////Last element of array will be added to first
        } */



        System.out.println(Arrays.toString(n));

    }

}
