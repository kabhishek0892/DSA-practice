package ArraysTest;

import java.util.Arrays;

//will solve it by two pointer approach
//only applicable in sorted array with unique elements
public class PairsWithGivenSum {
    public static void main(String[] args) {
        int arr[] ={ 1,4,5,6,7,8,3};
        //1,3,5,6,7,8
        int sum =13;
        Arrays.sort(arr);
        int i =0;
        int j=arr.length-1;

        while(i<j){
            if(arr[i]+arr[j]>sum)
            {
                j--;
            }
            else if(arr[i]+ arr[j]<sum)
            {
                i++;
            }
            else if(arr[i]+ arr[j]==sum){
                System.out.println(arr[i]+ " " + arr[j]);
                i++;
                j--;
            }
        }

    }
}
