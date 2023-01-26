package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LargestUniqueSubstringAllApproaches {

    public static void main(String[] args) {
        String str = "bccbdda";
        System.out.println("The input string is " + str);

       // int len = longestUniqueSubstringUsingSet(str);
       String s = getUniqueCharacterSubstringBruteForce(str);

        System.out.println("The length of the longest " +
                "non-repeating character " +
                "substring is " + s);
    }

   static String getUniqueCharacterSubstringBruteForce(String input) {
        String output = "";
        for (int start = 0; start < input.length(); start++) {
            Set<Character> visited = new HashSet<>();
            int end = start;
            for (end=start; end < input.length(); end++) {
                char currChar = input.charAt(end);
                if (visited.contains(currChar)) {
                    break;
                } else {
                    visited.add(currChar);
                }
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end);
            }
        }
        return output;
    }

    private static int longestUniqueSubsttr(String str) {
        int maxLength =-1;
        String test = "";
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);
            if(test.contains(current)){
                test =test.substring(test.indexOf(current)+1);
            }
            test = test + c;

            maxLength = Math.max(test.length(),maxLength);
        }

        return maxLength;
    }


    public static  int  longestUniqueSubstringUsingSet(String str) {
        Set<Character> set = new HashSet<>();
     int  i=0;
     int j=0;
     int res =0;
     while (j<str.length()){

         if(set.contains(str.charAt(j))){
             set.remove(str.charAt(i));
             System.out.println(Arrays.asList(set));
             i++;

         }
         else{
             set.add(str.charAt(j));
             System.out.println(Arrays.asList(set));
             j++;
         }
         res = Math.max(res, set.size());
     }

        return res;
    }
}



