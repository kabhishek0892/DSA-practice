package ArraysTest;

import java.util.Stack;

public class BalancedPrantheses {

    public static void main(String[] args) {
        System.out.println(isStringBalanced("[[]({})]"));
        System.out.println(isStringBalancedUsingContains("[[]({})]")) ;
    }
    static boolean isStringBalancedUsingContains(String s)
    {
        while(s.contains("{}")||s.contains("[]")||s.contains("()"))
        {
            s=s.replace("{}","").
                    replace("[]","").
                    replace("()","");
        }
        return s.equals("");
    }
    static boolean isStringBalanced(String s) {
        //String s = "[[]({})]";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '(': {
                    stack.push('(');
                    break;
                }
                case '[': {
                    stack.push('[');
                    break;
                }
                case '{': {
                    stack.push('{');
                    break;
                }
                case ']': {
                    if (stack.empty() || stack.peek() != '[') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                }
                case '}': {
                    if (stack.empty() || stack.peek() != '{') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                }
                case ')': {
                    if (stack.empty() || stack.peek() != '(') {
                        return false;
                    } else {
                        stack.pop();
                    }
                    break;
                }
            }
        }

        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
