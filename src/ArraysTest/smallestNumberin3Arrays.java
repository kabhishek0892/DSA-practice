package ArraysTest;

import java.util.TreeSet;

class smallestNumberin3Arrays{

    static void smallestNumberusingTreeset(int[] ar1,int[] ar2 ,int[] ar3){
        TreeSet<Integer> ts = new TreeSet<>();

        for (int i:ar1){
            ts.add(i);
        }
        for (int j:ar2){
            ts.add(j);
        }
        for (int k:ar3){
            ts.add(k);
        }

       // ts.forEach(System.out::println);
       // System.out.println(ts.stream().findFirst().get());
       // System.out.println(ts.toArray()[0]);

        Object[] allelements = ts.toArray();

        for (Object i : allelements){
            System.out.println(i);
        }

       // System.out.println(ts.last());
       // System.out.println(ts.first());
    }
    public static void main(String[] args) {
        int arr1[] ={3,5,7};
        int arr2[] ={6,9,13};
        int arr3[]= {12,4,66};
   smallestNumberusingTreeset(arr1,arr2,arr3);

    }
}