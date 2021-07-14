package selenium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {
        List<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(50);
        al.add(60);
        System.out.println(al);
        System.out.println("Size of array is "+ al.size());


        List<Integer> al2 = new ArrayList<>();
        al2.add(70);
        al2.add(80);

        al.addAll(al2);
        al.remove(new ArrayList<>(70));

        al.set(3,300);
        System.out.println(al);


        System.out.println( al.get(4));
       // al.remove(4);
       al.remove(Integer.valueOf(20));
        System.out.println(al);

      //  al.clear();
        System.out.println(al);

        for(int i=0;i<al.size();i++)
        {
            System.out.println("for  loop "+al.get(i));
        }

      for(Integer i : al)
        {
          System.out.println("for Each loop "+i);
        }

      Iterator<Integer> it = al.iterator();
      while(it.hasNext()){
          System.out.println(" Using Iterator " +it.next());
      }

      int n[] ={12,4,5,23,65,55,65};
      Arrays.sort(n);
        for(int i=0;i<n.length;i++)
        {
            System.out.println(n[i]);
        }
    }
}
