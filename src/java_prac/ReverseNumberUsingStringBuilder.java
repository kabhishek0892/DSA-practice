package java_prac;

public class ReverseNumberUsingStringBuilder {
    public static void main(String[] args) {
        int n=1237;
        String s = new StringBuilder(Integer.toString(n)).reverse().toString();
        System.out.println(s);
        int x =Integer.valueOf(s);
        double d =Double.valueOf(s);
        System.out.println(x + " "+ d);
    }
}
