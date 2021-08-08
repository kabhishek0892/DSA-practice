package ArraysTest;

public class maxSumSubArray {

    public static void main(String[] args) {
        int arr[] = {4,5,6,-3,2,9,-4};
        System.out.println(maxSumArray(arr));
    }
//Kanade Algorithm
    static int maxSumArray(int[] n)
    {
        int currentSum=0;
        int maxSum=0;

        for(int i=0;i<n.length;i++)
        {
           currentSum = currentSum + n[i];

           if(currentSum>maxSum)
           {
               maxSum = currentSum;
           }
           if(currentSum<0){

               currentSum=0;

           }
        }
        return maxSum;
    }
}
