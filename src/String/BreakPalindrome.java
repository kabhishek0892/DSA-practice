package String;

public class BreakPalindrome {

    public static void main(String[] args) {
        String s = breakPalindrome("maam");
        System.out.println(s);
    }
        static String breakPalindrome(String palindrome) {
            if (palindrome.length() == 1) return "";
            for (int i = 0; i < palindrome.length() / 2; ++ i) {
                if (palindrome.charAt(i) != 'a') {
                    return palindrome.substring(0, i) + 'a' +
                            palindrome.substring(i + 1);
                }
            }
            return palindrome.substring(0, palindrome.length() - 1) + 'b';
        }
    }

