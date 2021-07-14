package selenium;

import java.util.HashMap;
import java.util.Map;


public class FrequencyCheck {
    public static void main(String[] args) {
        String sen ="ram is ram body ram";
        String[] arr = sen.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i] + " ");
        }
        String s ="FrequencyCheck";
        s=s.toLowerCase();
        char charArry[]= s.toCharArray();
        Map<Character, Integer> map= new HashMap<>();

        for(Character c: charArry)
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }

        System.out.println(map);
        for(Map.Entry<Character,Integer> m : map.entrySet())
        {

            if(m.getKey()=='c')
            {
                System.out.println(m.getKey() + " is repeated " + m.getValue() +" times");  
            }
            if(m.getValue()>1) {
                System.out.println(m.getKey() + " is repeated " + m.getValue() +" times");
            }
            if(m.getValue()==1) {
                System.out.println("Unique characters in String is " +m.getKey() );
            }
        }
       /* Set<Character> set= map.keySet();
        for(Character c:set)
        {
            if(map.get(c)>1)
            {
                System.out.println(c +" is repeated " + map.get(c) + " times");
            }
        }*/


      /*  char string[] = s.toCharArray();
        System.out.println("The string is:" + s);
        System.out.print("Duplicate Characters in above string are: ");
int count =0;
        for(int i =0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if (string[i]==string[j])
                {
                    count ++;
                    System.out.print(string[j]);
                }

            }
        }
*/
        }
    }



