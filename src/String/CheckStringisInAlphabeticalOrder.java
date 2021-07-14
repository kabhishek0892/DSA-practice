package String;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CheckStringisInAlphabeticalOrder {

    public static void main(String[] args) {
        String[] s7 = {"JavaFX", "HBase", "OpenCV", "Ajgj", "Java", "Hadoop", "Neo4j"};
        String x ="a d c b";

        String[] s8=x.split(" ");
        sortStringArray(s8);
        //System.out.println(checkALphatecicalOrder("abz"));
        System.out.println(checkAlphabetical("abz"));
       String s ="aRam is jgood";
       String[] s1=s.split(" ");
        System.out.println(checkStringUsingCompareTo(s1));
        char[] c= {'v','o','l','e','n'};
        String s3=new String(c);
        System.out.println("Char to String is "+s3);
        String s4=String.valueOf(c);
        System.out.println("Char to String is "+s4);
    }

  /* static  boolean checkALphatecicalOrder(String s)
    {

        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)<s.charAt(i-1))
            {
                return false;
            }
        }
        return true;
    }*/

    static boolean checkAlphabetical(String str)
    {
        char[] org = str.toCharArray();

        char[] mod = new char[org.length];
        for(int i=0;i<org.length;i++)
        {
            mod[i]=org[i];
        }
        System.out.println("Original Array "+Arrays.toString(org));
        Arrays.sort(mod);

        System.out.println("Modified Array "+Arrays.toString(mod));

        return Arrays.equals(org,mod);

    }

    static boolean checkStringUsingCompareTo(String[] str)
    {
      for(int i=1;i<str.length;i++)
      {
          if(str[i-1].compareTo(str[i])>0){
              return false;
          }
      }
        return true;
    }

    static void sortStringArray(String[] s){

        String temp;
        for(int i=0;i<s.length;i++) {
            for(int j=i+1;j<s.length;j++)

            {
                if (s[i].compareToIgnoreCase(s[j]) > 0) {
                    temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        System.out.println("Sorted string is "+Arrays.toString(s));



    }


}
