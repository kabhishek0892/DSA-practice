public class testInterface implements  Interface2,InteraceTest {

    @Override
    public void showDetails() {

        InteraceTest.super.showDetails();

        Interface2.super.showDetails();

    }

    public static void main(String[] args)
    {
    testInterface t= new testInterface();
    InteraceTest.getDetails();
    Interface2.getDetails();
    t.showDetails();

    }
}
