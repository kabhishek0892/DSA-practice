package String;

public class CountNofoAlphabestAndIntegerinString {

    public static void main(String[] args) {
        String s ="My birth comes on 9 August 1992";
        int stringCount=0, digitCount=0;int countdigit =0;
        System.out.println("Regex soln is "+s.replaceAll("[a-zA-Z]","").length());
        System.out.println("Regex soln is "+s.replaceAll("\\D","").length());


        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57)
            {

                System.out.println(s.charAt(i));
                digitCount++;
            }
        }
        System.out.println("No of digits is "+digitCount);
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                countdigit++;
                System.out.println(s.charAt(i));
            }
            if(Character.isAlphabetic(s.charAt(i)))
            {
                System.out.println(s.charAt(i));
                stringCount++;
            }
        }
        System.out.println("No of digits is "+countdigit);
        System.out.println("No of string is "+stringCount);

    }
}
