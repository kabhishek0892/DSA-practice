package String;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("i.like.this.program.very.much"));
        String a = "flow";
        String b = "flower";

        System.out.println(b.indexOf(a));
        while(b.indexOf(a)!=0)
        {
            a =a.substring(0,a.length()-1);
        }
        System.out.println(a);
    }

    static String reverseWords(String S)
    {

        String[] ip = S.split("\\.");
        String res ="";
        for(int i=ip.length-1;i>=0;i--){
            res =res+ip[i]+".";

        }
        return res.substring(0,res.length()-1);
    }
}
