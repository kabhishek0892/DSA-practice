package String;

import java.util.LinkedHashMap;
import java.util.Map;

//When you have to return unique character -- > can use linkedHashMap
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        char x =firstUniqChar("eetltu");
        System.out.println("First unique character is " + x);
    }
    static char firstUniqChar(String s) {

        Map<Character,Integer> map = new LinkedHashMap<>();
        for(char c : s.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1) ;
            }
            else{
                map.put(c,1);
            }
        }

        for(Map.Entry<Character,Integer> m:map.entrySet()){
            if(m.getValue()==1){
                return m.getKey();
            }
        }
        throw new IllegalArgumentException("Not found");
    }
}
