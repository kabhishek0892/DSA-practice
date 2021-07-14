package selenium;

import java.util.HashSet;
import java.util.Set;

public class Plaindrome {

    public static void main(String[] args) {
        String s ="noon";
        StringBuffer buffer = new StringBuffer(s);
       String s1= buffer.reverse().toString();
       if(s.equals(s1))
       {
           System.out.println("String is Palindrome");
       }
       else{
           System.out.println("String is not Palindrome");
       }
        String reverse ="";
        for(int i=s.length()-1;i>=0;i--)
        {
             reverse = reverse + s.charAt(i);
        }
        System.out.println("Resverse string is "+ reverse);
    if(reverse.equals(s))
        {
    System.out.println("String is plaindrome");
     }
    else{
    System.out.println("String is not plaindrome");
        }
        int OldSize = s.length();
        System.out.println("Old size is"+OldSize);
        Set<Character> set = new HashSet<>();
       for(char c : s.toCharArray()) {
           set.add(c);
       }
       int newSize =set.size();
        System.out.println("New size is "+newSize);

        //reverse a number to check if its palindrome

        int rev =0;
        int remainder ;
        int number = 243;
        int temp= number;
        while (number>0)
        {
            remainder = number%10;
            rev = rev *10 +remainder;
            number = number/10;
        }
        if(temp==rev) {
            System.out.println(reverse + "is palindrome");
        }
        else{
            System.out.println( reverse + " is not palindrome");
        }
    }
}

