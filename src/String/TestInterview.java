package String;

import java.util.Arrays;

public class TestInterview {
    public static void main(String[] args) {

        int a[]=  {100,12,34,24,56,95,0,1,13,94};

        int max = Integer.MIN_VALUE;
        int secondmax =Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                secondmax=max;
                max=a[i];
            }
        if(a[i]<max && a[i]>secondmax)
        {
            secondmax =a[i];
        }
        }
        System.out.println("Second highest no in array is "+ secondmax);


    }



}
