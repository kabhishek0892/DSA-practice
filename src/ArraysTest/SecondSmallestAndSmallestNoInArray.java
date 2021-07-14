package ArraysTest;

public class SecondSmallestAndSmallestNoInArray {
    public static void main(String[] args) {
        int n[] = {4,3,6,7,8,2};
        int smallest = 10;
        int secondsmallest =10;
        for(int i =0;i<n.length;i++){
            if(n[i]<smallest)
            {
                secondsmallest=smallest;
                smallest = n[i];
            }
            if(n[i]>smallest && n[i]<secondsmallest)
            {
                secondsmallest=n[i];
            }
        }
        System.out.println("Smallest no in array is "+ smallest);
        System.out.println("Second Smallest no in array is "+ secondsmallest);
    }
}
