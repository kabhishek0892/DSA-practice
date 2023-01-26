package String;

public class CountNofoAlphabestAndIntegerinString {

    public static void main(String[] args) {
        String s ="My birth comes on 9 August 1992";
        int stringCount=0, digitCount=0;int countdigit =0;
        String s1 = s.replaceAll("[a-zA-Z]","");
        System.out.println("value of s1 is"+ s1);
        System.out.println("Regex soln is "+s.replaceAll("[a-zA-Z]","").length());
        System.out.println("Regex soln is "+s.replaceAll("\\D","").length());


        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>=48 && s.charAt(i)<=57)
            {
                System.out.print("Digit is "+s.charAt(i));
                digitCount++;
            }
            else if( (s.charAt(i)>=65 && s.charAt(i)<=90) || (s.charAt(i)>=97 && s.charAt(i)<=122)){
                System.out.print("String is "+s.charAt(i));
                stringCount++;
            }

        }

        System.out.println("No of digits is "+digitCount);
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                countdigit++;

            }
            if(Character.isAlphabetic(s.charAt(i)))
            {
                stringCount++;
            }
        }
        System.out.println("No of digits is "+countdigit);
        System.out.println("No of string is "+stringCount);

    }
}
