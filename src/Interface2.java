public interface Interface2 {
    static void getDetails() {
        System.out.println("This is static method in Interface 2");
    }

    default void showDetails(){
        System.out.println("This is default method in Interface 2");
    }

}
