package String;
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

import java.util.ArrayList;
import java.util.List;

//Example 1:
//Input: s = "cbaebabacd", p = "abc"
//Output: [0,6]
//Explanation:
//The substring with start index = 0 is "cba", which is an anagram of "abc".
//The substring with start index = 6 is "bac", which is an anagram of "abc".
public class FindAllAnagramInString {

    public List<Integer> findAnagram(String s, String p){
        List<Integer> result = new ArrayList<>();

        int[] shash = new int[26];
        int[] phash = new int[26];

        int window = p.length();
        int len = s.length();

        for(char c : p.toCharArray()){


        }

   return result;
    }

    public static void main(String[] args) {
        //List<Integer> op =
    }


}
