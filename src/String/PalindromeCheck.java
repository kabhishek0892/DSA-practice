package String;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s ="0P";
        String s1=s.toLowerCase();
        s1=s1.replaceAll("[^a-z0-9]","");
        System.out.println(s1);

        String s2= new StringBuilder(s1).reverse().toString();
        System.out.println("Reversed string is "+ s2);
        if(s1.equals(s2))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not Plaindrome");
    }
}
