package java_prac;

import java.util.Scanner;

// 115 - 111 , 117-121
public class NearestPalindromeNo {
    public static void main(String[] args) {
        System.out.println("Enter the no to which nearest palindrome is to be found");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

         if(Math.abs(num-GreaterPalindrome(num))>Math.abs(num-LesserPalindrome(num))){
             System.out.println("Nearest palindrome is "+LesserPalindrome(num));
         }
         else
             System.out.println("Nearest palindrome is "+GreaterPalindrome(num));

    }

    static int GreaterPalindrome(int k){
        while(!PalindromeCheck(k))
        {
            k++;
        }
        return k;
    }

    static int LesserPalindrome(int l){
        while(!PalindromeCheck(l))
        {
            l--;
        }
        return l;
    }

    static  boolean PalindromeCheck(int n)
    {
       int rev =0;
       int temp =n;
       int d;
       while(n>0)
       {
           d=n%10;
           rev = rev *10 + d;
           n=n/10;

       }
       if(temp ==rev)
       {
           return true;
       }
       else{
           return false;
       }

    }
}
