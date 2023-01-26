package ArraysTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ThreeSum {


    public static void main(String[] args) {
        int[] arr = new int[] { 0, -1, 2, -3, 1 };
        int sum = -2;
        int n = arr.length;
       // findTriplets(arr, n, sum);
        findTripletsUsingSet(arr, n, sum);
    }


      //two pointers in sorted array
    //time complexity : 0(n2)
    //space complexity 0(1)
     static void findTriplets(int[] arr, int n, int sum) {
        Arrays.sort(arr);

        for(int i=0;i<n-1;i++){

            int l = 0;
            int r = n-1;
            int x =arr[0];

            while (l<r){
                if (x+arr[i]+arr[r] == sum){
                    System.out.println("Triplets are " + x + "  " + arr[i] + " "+ arr[r]);
                    l++;
                    r--;
                }

               else  if (x+arr[i]+arr[r] > sum){
                    r--;
                }

               else
                   l++;
            }
        }
    }

    static void findTripletsUsingSet(int[] arr, int n, int sum){

        for (int i = 0; i <n-1 ; i++) {

            Set<Integer> set = new HashSet<>();
            for (int j = 1; j <n-1 ; j++) {

                int x = sum - (arr[i] + arr[j]);

                if(set.contains(x)){
                    System.out.println(arr[i] + " "+ arr[j]+ " "+ x);
                }
                else{
                    set.add(arr[j]);
                }

            }
        }
    }

}
