package ArraysTest;

import java.util.Arrays;

public class RotateArray {


    public static void main(String[] args) {
        int n[] = {3,5,7,9,1,6,8}; //

        int k = 4;

        //Rotate the given array by k times toward left

        for(int i=0;i<k;i++)
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
        }

        System.out.println(Arrays.toString(n));

    }

}
