package String;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s1="Angel";
        String s2="Angle";
        System.out.println(AnagramTest(s1,s2));
    }

    static boolean AnagramTest(String s1,String s2){
        if(s1.length()!=s2.length())
        {
            return false;
        }
        Arrays.sort(s1.toCharArray());
        Arrays.sort(s2.toCharArray());

        if(s1.equals(s2))
        {
            return  true;
        }

        return true;
    }
}

