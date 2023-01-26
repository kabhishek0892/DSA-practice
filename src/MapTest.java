import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapTest {
    public static void main(String[] args) {
      Map m1 = new HashMap<String,Integer>();
      Map m2 = new HashMap<String,Integer>();

        m1.put("Abhishek",30);
        m1.put("Abhiruchi",22);
        m1.put("Abhijeet",20);
        m1.put("Abhilasha", 27);

        m2.put("Abhishek",35);
        m2.put("Abhiruchi1",22);
        m2.put("Abhijeet1",20);
        m2.put("Abhilasha1", 27);

        System.out.println("Map 1 ----> "+m1);
        System.out.println("Map 2 ----> "+m2);
      //  System.out.println(m1.values());
      Set<String> s = m1.keySet();


       for(String a :s){
         if(m2.containsKey(a)){
           System.out.println( m1.get(a));
           System.out.println( m2.get(a));
         }
       }
    }
}
