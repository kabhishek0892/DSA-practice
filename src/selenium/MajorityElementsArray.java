package selenium;

import java.util.*;

public class MajorityElementsArray {


    public static void main(String[] args) {
        int[] n={3,5,7,4,3,4,5,6,6,4,3};

        Map<Integer,Integer> hm = new HashMap<>();
        for (int i :n) {
           if(hm.containsKey(i))
           {
               hm.put(i,hm.get(i)+1);
           }
           else{
               hm.put(i,1);
           }
        }
        System.out.println(hm);

    /* Object[] arr =hm.keySet().toArray();
        for(int i=0;i<hm.size();i++)
        {
            System.out.print(arr[i]);
        }*/

        int[] a=new int[hm.size()];
        int[] val = new int[hm.size()];
        int i=0;
        int x=0;
        int[] max = new int[hm.size()];
        for(Map.Entry<Integer,Integer> m :hm.entrySet()){
                a[i]=m.getKey();
                val[i]=m.getValue();
                i++;
                if(m.getValue()>2)
                {
                    max[x] = m.getKey();
                    x++;
                }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(val));
        System.out.println(Arrays.toString(max));
        System.out.println(x);

    }
}