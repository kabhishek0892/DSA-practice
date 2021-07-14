package ArraysTest;

public class LargestAndSecondLargestNiInArray {
    public static void main(String[] args) {
        int largest =0;
        int secondLargest =0;
        int n[] = {4,6,7,3,8,9,5};
        for(int i=0;i<n.length;i++)
        {
            if(n[i]>largest)
            {
               secondLargest=largest;
                largest=n[i];
            }
            if(n[i]<largest && n[i]>secondLargest)
            {
                secondLargest=n[i];
            }
        }
        System.out.println(largest);
        System.out.println(secondLargest);
    }
}