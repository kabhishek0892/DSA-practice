package ArraysTest;

public class LargestProductOfTwoConsecutiveElements {

    static int maxProduct(int[] a)
    {
       int max =Integer.MIN_VALUE;
        for(int i=1;i<a.length;i++)
        {
            if(a[i] * a[i-1]>max)
            {
                max = a[i] *a[i-1];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int a[] = {5,8,13,3,9,4,8,12,10,18};
        System.out.println("Maximum Product is "+maxProduct(a));

    }
}
