package String;

import java.util.Arrays;

public class MaxOccuringCharUsingFreqTable {

    public static void main(String[] args) {
        String str ="abcdefabcdef";


        int freq[] = new int[26];
        for(int i=0;i<str.length();i++){
         /*   char ch = str.charAt(i);
            int n = ch -'a';
            freq[n]++;*/
            freq[str.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(freq));

        int max=-1;
        int ans=0;

        for(int i=0;i<freq.length;i++){
         if(max<freq[i]){
             ans =i;
             max =freq[i];
         }
        }

        char ch = (char) (ans + 'a');
        System.out.println("max"+max);
        System.out.println("Freq"+ans);
        System.out.println("Char"+ch);
    }

    public static char getMaxOccuringChar(String line) {


        return 0;
    }


}
