package selenium;
import java.util.HashMap;
import java.util.Map;

public class UniqueString {

    public static void main(String[] args) {
        String s = "bbcpp";
        // int l =lengthOfLongestSubstring(s);
        // System.out.println(l);
        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hm.containsKey(s.charAt(i))) {
                hm.put(s.charAt(i), i);
            } else {
                break;
            }

        }
        System.out.println(hm);
//abcpp
        //start = max(0,3) =3
   /* static int lengthOfLongestSubstring(String s) {
        int start =0;
        int max_length=0;
        Map<Character,Integer> hm = new HashMap<>();
        for(int end =0;end<s.length();end++)
        {
            if(hm.containsKey(s.charAt(end)))
            {
                start = Math.max(start,hm.get(s.charAt(end)));
            }

                hm.put(s.charAt(end),end);

            max_length =Math.max(max_length,end-start+1);
        }
        return max_length;
    }*/
    }
}
