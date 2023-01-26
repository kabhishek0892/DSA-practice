package String;
/*Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".
        Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"
        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.*/

import java.lang.reflect.Array;

public class LongestCommonPrefixinanArray {

    public String longestCommonPrefix(String[] s){
        if(s.length==0) return " ";
            String result = s[0];

      //logic is to decreament result if index of other strings is !=0    ie
            for(int i=1;i<s.length;i++){
                while(s[i].indexOf(result)!=0){
                    result = result.substring(0,result.length()-1);
                }
            }
        return result;
    }



}
