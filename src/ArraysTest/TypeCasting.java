package ArraysTest;

public class TypeCasting {



    public static void main(String[] args) {
        int i=10;
        //widening//Upcasting
        double d = i;
        System.out.println(i);
        System.out.println(d);

        //Narrowing//Typecasting //Downcasting
        //Double to int
        int x=(int)d;
        System.out.println(x);
    }
}
