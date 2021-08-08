package String;

import java.util.ArrayList;
import java.util.List;

public class MinimunCharacter_String_Palindrome {
    public static void main(String[] args) {
        String str = "aabbc";
        List<Character> list = new ArrayList();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i))) {
                list.remove((Character) str.charAt(i));
                System.out.println(list);
            } else {
                list.add(str.charAt(i));
                count++;
                System.out.println(list);
            }

        }

        int k = list.size();
        System.out.println("Minimum insertion required to make Palindrome is " + (k - 1));


    }
}
