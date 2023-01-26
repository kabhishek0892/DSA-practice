package ArraysTest;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int arr[] = {3,3,4};
        System.out.println(majorityElement(arr ));

    }

    public static int majorityElement(int[] nums) {
        int result=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put (i,map.get(i)+1);
            }

            else{
                map.put(i,1);
            }
        }
        System.out.println(map);

        for (Map.Entry<Integer,Integer> hm : map.entrySet()) {
            if (hm.getValue() >(nums.length/2))
                result = hm.getKey();
        }
        return result;
    }
}
