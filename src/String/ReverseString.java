package String;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        //Using String Builder
        String s ="revered";
        StringBuilder sb = new StringBuilder(s);
        String s1= sb.reverse().toString();
        System.out.println(s1);

        char[] s2= {'h','e','l','l','o'};
        System.out.print("Original Array is "+Arrays.toString(s2));
        char[] rev= new char[s2.length];
        int j=0;
        for(int i=s2.length-1;i>=0;i--){
            rev[i]=s2[j];
            j++;
       }
        System.out.print("Reverse Array is " + Arrays.toString(rev));


    }
}
