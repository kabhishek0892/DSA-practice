import java.util.Arrays;

public class TestInterview1 {

  /*  Sample input - the name of my company is meesho
    Reg ex: ^[A-Z][a-z]*\.$

    Each word is ordered by length in ascending order
    World of same lengths must appear in the original order
    Rearranged sentence must be formatted to satisfy the reg ex :  ^[A-Z][a-z]*\.$

    Output : of my is the name meesho company*/

    public static void main(String[] args) {
        String s ="the name of my company is meesho";

        String[] s1 = s.split(" ");
        String temp;
        /*for(int i=0;i<s1.length;i++)
        {
            for(int j=i;j< s1.length;j++)
            {
                if(s1[i].length()>s1[j].length())
                {
                   temp = s1[i];
                   s1[i]=s1[j];
                   s1[j] =temp;
                }
            }
        }*/

        //System.out.println(Arrays.toString(s1));

    }
}
