package String;
public class ConvertToOppositeCase {

    public static void main(String[] args) {
        String s ="GrEat PowOr";
        StringBuilder sb = new StringBuilder(s);

        for(int i=0;i<s.length();i++)
        {
           char c = sb.charAt(i);
           if(Character.isLowerCase(c))
           {

              sb.setCharAt(i,Character.toUpperCase(c));
           }
           else{
               sb.setCharAt(i,Character.toLowerCase(c));

           }
        }
        System.out.println("New String is "+ sb.toString());

    }
}
