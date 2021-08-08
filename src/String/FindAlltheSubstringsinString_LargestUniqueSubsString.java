package String;

import java.util.HashSet;
import java.util.Set;

public class FindAlltheSubstringsinString_LargestUniqueSubsString {

    public static boolean UniqueSubSring(String str)
    {
        for(int i=0;i<str.length();i++) {
            for(int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                    return false;
            }
        }
        return true;
    }
    public static boolean UniqueSubSringUsingSet(String str)
    {
       Set<Character> set = new HashSet<>();
       for(char s:str.toCharArray())
       {
           set.add(s);
       }
       if(set.size()==str.length())
        return true;
       else
           return false;
    }
    public static void main(String[] args) {
      String max="";
      String var="";

        String s="acdaaabcdb";
    for(int i=0;i<s.length();i++)
    {
        for(int j=i+1;j<=s.length();j++)
           {
          var=  s.substring(i,j);
          if(UniqueSubSringUsingSet(var))
          {
              if(var.length()>max.length())
              {
                  max =var;
              }
          }
           }
        }
        System.out.println("Unique Substring is " + max);
    }
    }
