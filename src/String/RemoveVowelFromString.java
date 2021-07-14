package String;

public class RemoveVowelFromString {
    public static void main(String[] args) {
        String s ="bchfgsjksjdaibfuiopu";
        String s1 = s.replaceAll("[aeiou]","");
        System.out.println(s1);

        for(int i =0;i<s.length();i++)
        {
           char c = s.charAt(i);
           if(s.indexOf(c)==s.lastIndexOf(c))
           {
               System.out.println(s.charAt(i));
           }
        }

        char x = 'a';
        int asc=(int)x;
        System.out.println("Asci value of a is "+asc);
        String s2="abcAB";
        for(int i=0;i<s2.length();i++)
        {
            char y= s.charAt(i);
           // int acsVal = (int)s.charAt(i);
            System.out.println("Asci value of "+s.charAt(i)+ " is"+"acsVal");
        }
    }
}
