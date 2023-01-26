package String;

public class CheckPalindromAndBreak {

   static boolean isPalindroms(String s)
    {
       String p =  new StringBuilder(s).reverse().toString();
       return p.equals(s);
    }
    public static void main(String[] args) {

        String s = "racecarkayakanna" ;
        int start =0;
        int mid =2;
        int end = s.length();
        String temp = null;

        while (mid <=end){
           temp = s.substring(start,mid);
        if (!isPalindroms(temp) && temp.length()>1){
               mid++;
           }
            if (isPalindroms(temp)){
                System.out.println(temp);
                start =mid;
                mid+=2;
            }
        }
    }
}
