package ArraysTest;

import java.util.*;

public class IntersectionOfTwoArrays {

    static void intersection(int a[],int b[])
    {
        Set<Integer> set1 = new TreeSet<>();
        for(int i=0;i<a.length;i++)
        {
            set1.add(a[i]);
        }
      /* Iterator it = set1.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next());
        }*/
        Set<Integer> set2 = new TreeSet<>();
        for(int i=0;i<b.length;i++)
        {
           set2.add(i);

        }
        System.out.println(set2);
        set1.retainAll(set2);
        System.out.println("Set 1" +set1);
        System.out.println(" Set 2"+set2);


    }

    public static void main(String[] args) {
        int arr1[] = { 1, 1, 2, 1, 2, 3};
        int arr2[] = { 4, 5, 0, 5, 7, 2, 7, 3,3 };
        intersection(arr1,arr2);

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1,2,3,5,6));
    }
}
