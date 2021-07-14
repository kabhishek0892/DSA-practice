public interface InteraceTest {

    static void getDetails() {
        System.out.println("This is static method in Interface 1");
    }

    default void showDetails(){
        System.out.println("This is default method in Interface 1");
    }

}
