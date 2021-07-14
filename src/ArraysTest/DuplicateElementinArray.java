package ArraysTest;

import java.util.*;

public class DuplicateElementinArray {
    public static void main(String[] args) {
        //using Set
        List<Integer> al = new ArrayList();
        int arr5[] = {4,5,3,7,8,9,7,1,4,9};
        int arr3[] ={1,2,2,3,3,4,5,5,3,4,3,4,6,6,1,3,3,3};
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr3.length;i++){
            if(set.contains(arr3[i]))
            {
                System.out.print(arr3[i]);
                al.add(arr3[i]);
            }
            else{
                set.add(arr3[i]);
            }
        }
        System.out.println("Array of duplicate elements is "+ al);
        int arr2[] = {4,5,3,7,8,9,7,1,4,9};
        int arr[] = {1,2,2,3,3,4,5,5,3,4,3,4,6,6,1,3,3,3};
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(m.containsKey(arr[i]))
            {
                m.put(arr[i],m.get(arr[i])+1);

            }
            else{
                m.put(arr[i],1);
            }
        }
        System.out.println(m);
        m.forEach((k,v)->{
            if(v%2==0) {
                System.out.print(k + " ");
            }
        });

        m.forEach((k,v)-> {
            System.out.println(k + " " + v);
        });

        m.forEach((k,v)->
            System.out.println(k + " " + v));

    }
}

