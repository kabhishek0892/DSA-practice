package selenium;

import java.util.HashMap;
import java.util.Map;

public class UniqueElementinArray {

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 3};
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            } else {
                hm.put(i, 1);
            }
        }
        System.out.println(hm);
        int max =0; int secMax = 0; int k=0;
        for (Map.Entry<Integer, Integer> map : hm.entrySet()) {


               if(map.getValue()> max)
               {
                   secMax = max;
                   max=map.getValue();
                   k = map.getKey();

               }
        }
        System.out.println(max);
        System.out.println(secMax);
        System.out.println(k);

    }
}