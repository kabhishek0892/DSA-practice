package String;

import java.util.HashSet;
import java.util.Set;

public class LargestUniqueSubstring {

    static int LongestSubstringUsingSet(String s){
        Set<Character> set = new HashSet<>();
         int i=0; // slow pointer
        int j=0; //  fast pointer
        int res=0;
        String op;

        while (j<s.length()){
            if(set.contains(s.charAt(j))) //if already added to set , remove character at ith index
            {
                set.remove(s.charAt(i));
                i++;
            }
            else{
                set.add(s.charAt(j)); // If not added, just add it to set

                j++;

            }

            res = Math.max(set.size(),res);
        }
return  res;
    }

    static int LengthofLongestSubstring(String s)
    {
        int ans =0;
        int len = s.length();
        for (int i = 0; i <len ; i++) {

            Set<Character> set = new HashSet<>();
            set.add(s.charAt(i));
            int temp=1;
            for (int j = i+1; j <len ; j++) {

                char ch = s.charAt(j);
                if(set.contains(s.charAt(j)))
                {
                    break;
                }
                else{
                    set.add(ch);
                    temp++;
                }

            }
            if(temp>ans){
                ans=temp;
            }
            System.out.println(set);
        }

        return ans;

    }


    public static void main(String[] args) {

            String s ="abcaffga";
        System.out.println(LongestSubstringUsingSet(s));
            String largest ="";

            for(int i=0;i<s.length();i++)
            {
                String checked="";


                for(int j=i+1;j<s.length()-1;j++)

                {
                    if(s.charAt(i)==s.charAt(j))
                        checked=s.substring(i,j);

                    break;

                }
                if(checked.length() >largest.length())
                {
                    largest=checked;
                }

            }




        }
    }
