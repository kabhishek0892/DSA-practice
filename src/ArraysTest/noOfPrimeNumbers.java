package ArraysTest;

public class noOfPrimeNumbers {

    public static void main(String[] args) {

        int n=25;

        boolean flag = false;
/*
        if(n<1){
            System.out.println("No is not prime");

        }

        if(n==2 ){
            System.out.println("No is prime");

        }*/
        for(int i=3;i<Math.sqrt(n);i++){

                if(n%i==0)
                {
                    flag=true;
                    break;
                }
        }

        if(!flag)
        {
            System.out.println(n+ " is a prime no");
        }
       else
        {
            System.out.println(n+ " is not a prime no");
        }
    }
}