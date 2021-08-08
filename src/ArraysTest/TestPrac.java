package ArraysTest;

public class TestPrac {

    public static void main(String[] args) {
        checkTriangeType(10,10,40);
    }
    static void checkTriangeType(int side1,int side2,int side3)
    {

        if((side1==side2) && (side2==side3))
        {

            System.out.println("Its a equilateral triangle");

        }

        else if(( side1!=side2 ) && (side2!=side3))
        {
            System.out.println("Its a scalene triangle");
        }

        else {

            System.out.println("Its a isocelless triangle");

        }

    }
}
