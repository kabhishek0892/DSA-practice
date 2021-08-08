package ArraysTest;

import java.util.Arrays;

public class shiftZeroestoRightSide {

    public static void main(String[] args) {
        int[] arr1={1,3,0,5,0,8,0,0,0,9};
        int[] arr2= new int[arr1.length];
       int count=0;
        for(int i:arr1)
        {
            if(i!=0)
            {
                arr2[count] = i;
                count++;
            }
        }

        System.out.println(Arrays.toString(arr2));
    }
}
