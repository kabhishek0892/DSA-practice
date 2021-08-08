package ArraysTest;

import java.util.ArrayList;
import java.util.List;

public class Spiral {

        public static ArrayList<Integer> spiralOrder(int[][] A) {
            int T,B,L,R,dir;
            T=0;
            B=A.length-1;
            L=0;
            R=A[0].length-1;
            dir=0;
            int i;
            ArrayList al = new ArrayList();

            while(T<=B && L<=R)
            {
                if(dir==0)
                {
                    for(i=L;i<=R;i++)
                        al.add(A[T][i]);
                    T++;
                }
                else if(dir==1)
                {
                    for(i=T;i<=B;i++)
                        al.add(A[i][R]);
                    R--;
                }
                else if(dir==2)
                {
                    for(i=R;i>=L;i--)
                        al.add(A[B][i]);
                    B--;
                }
                else if(dir==3)
                {
                    for(i=B;i>=T;i--)
                        al.add(A[i][L]);
                    L++;
                }
                dir=(dir+1)%4;
            }
            return al;
        }

    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // Function Call
        ArrayList ax =spiralOrder(a);
        System.out.println(ax);
    }
    }

