package String;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapGetndex {
    public static void main(String[] args) {
        String s = "baalubbbu";
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
        System.out.println(map);
        for(Map.Entry<Character,Integer> m:map.entrySet()){
            if(m.getValue()==1){
                System.out.println(m.getKey());

            }
        }
    }
}
