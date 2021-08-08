package String;

public class SumNumbersinAString {

    public static void main(String[] args) {
        String s = "as34dfsdf12dfsdf45";
        System.out.println(findSum(s));
    }
    static int  findSum(String s) {
        // holds sum of all numbers present in the string
        int sum=0;
        String temp="0";

        for(int i=0;i<s.length();i++)
        {
           char ch = s.charAt(i);
            if(Character.isDigit(ch))
            {
             temp = temp+ ch;
            }
            else{
                sum = sum + Integer.parseInt(temp);
                temp ="0";
            }

        }
        return sum + Integer.parseInt(temp);
    }
}
