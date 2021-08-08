package ArraysTest;

public class PrintSpiralMatrix {
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        int R = 3;
        int C = 6;

        spiralPrint(R, C, a);
    }

     static void spiralPrint(int r, int c, int[][] a) {

        int top =0;
        int down=c-1;
        int left=0;
        int right = r-1;
    }


}
