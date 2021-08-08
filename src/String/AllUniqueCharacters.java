package String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AllUniqueCharacters {
    public static void main(String[] args) {
        System.out.println(allUniqueChar("abhisyrt"));
        String str = "xyfgthpe";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
                System.out.println("All chars are unique");
            }
        }

    }

    static boolean allUniqueChar(String s) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!set.add(c)) {
                return false;
            }
        }
        return true;

    }

    void findDuplicateCharacter(String p) {
        Set<String> s = new HashSet<>();

        for (int i = 0; i < p.length(); i++) {
            if (s.contains(p)) {

            }
        }
    }
}
