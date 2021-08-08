package ArraysTest;

public class findAllSubArrayinArray {
    public static void main(String[] args) {
        int [] arrA = {1,2,3, 4};

        int n = arrA.length;
        //start point
        for (int i = 0; i <n ; i++) {
            //group sizes
            for (int j = i; j <=n ; j++) {
                //if start point = 1 then
                //grp size = 1 , print 1
                //grp size = 2, print 1 2
                //grp size = 3, print 1 2 3 ans so on
                for (int k = i ; k < j ; k++) {
                    System.out.print(arrA[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
