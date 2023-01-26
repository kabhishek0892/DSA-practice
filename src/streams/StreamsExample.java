package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(11, 9, 13, 4, 5,5,9);
        int sum = integers.stream() //create a stream then filter , reduce ,collect
                                .reduce(0,Integer::sum);
        System.out.println("Sum  " + sum);


        String[] s = {"Abhishek","Abhiruchi","Abhijeet","Golu"};

       Arrays.stream(s).
               filter(str-> str.startsWith("Abhi")).
               map(str -> str.toLowerCase()).
               sorted().
               forEach(System.out::println);

       integers.stream().distinct().sorted().forEach(System.out::println);
        System.out.println();
      // integers.stream().sorted().forEach(System.out::print);

        //Print only odd numbers in list

        integers.stream().filter(num -> (num%2==0)).forEach(System.out::println);
    }
}
