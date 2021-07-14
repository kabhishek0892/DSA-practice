package selenium;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] ={1,3,5,6,7};
        int[] arr2 = new int[arr.length];
        int rotate = 2;
        //expected  arr[] ={5,6,7,1,3}
        int j=0; //3
        for (int i =rotate;i<arr.length;i++)
        {

            arr2[j] = arr[i];
            j++;
        }

        for (int i =0;i<rotate;i++)
        {
            //arr2[4] =arr[0] , arr2[5] = arr[2]
            arr2[arr.length- rotate+i] = arr[i];
        }

        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i]);
        }

    }

}
