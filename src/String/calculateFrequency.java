package String;

import java.util.Arrays;

public class calculateFrequency {

    public static void main(String[] args) {
        String s = "anagram";
        String s1= "gramanae";
        int fmap[] = new int[26];
        for (int i = 0; i <s.length() ; i++) {
           // fmap[s.charAt(i) - 'a']++;
            fmap[s1.charAt(i)- 'a']--;
        }

        for (int x :fmap) {
            if(x!=0){
                System.out.println("No is not palindrome");
            }

        }

        System.out.println(Arrays.toString(fmap));
    }
}
