package selenium;

import java.util.Arrays;

public class SumClosestZero {
    public static void main(String[] args) {
       int n[]={-40, -5, 1, 3, 6, 7, 5, 20};
      // Arrays.sort(n);

       int i=0;
       int j= n.length-1;
       int sum = 15;

       while(i<j)
       {
           if(n[i]+n[j]>sum)
           {
               j--;
           }
          else if(n[i]+n[j]<sum)
           {
               i++;
           }
           else
           {
               System.out.println(n[i]+ " "+ n[j]);
               break;
           }

       }
       }

    }

