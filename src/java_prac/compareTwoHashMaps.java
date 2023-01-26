package java_prac;

import java.util.HashMap;
import java.util.Map;

public class compareTwoHashMaps {

    public static void main(String[] args) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        map1.put('a',8);
        map1.put('b',21);
        map1.put('c',15);
        map1.put('d',98);

        map2.put('e',10);
        map2.put('f',29);
        map2.put('g',65);
        map2.put('c',30);


        System.out.println(map1);
        System.out.println(map2);

        for (Map.Entry<Character,Integer> hm:map1.entrySet()){
            System.out.println(hm.getKey() + " " + hm.getValue());
        }

        for(Character c:map2.keySet())
            System.out.println("key"+c);

       // for()
    }
}
