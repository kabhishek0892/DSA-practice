package String;

public class RotateString {
//abcd -->  lr --> cdab  -->  rr --> dcab
    static String leftRotate(String str, int d)
    {
      str = str.substring(d )+ str.substring(0,d);
       return str;
    }

    static String rightRotate(String str, int d)
    {
     //str = str.substring(str ,str.length()-d);
        return str;
    }

    public static void main(String[] args) {
        String s = "abcd"; // cdab
        //s=s.substring(2);
       // s=s.substring(0,2);
        String op=leftRotate(s,2);

        System.out.println(op);
    }
}
