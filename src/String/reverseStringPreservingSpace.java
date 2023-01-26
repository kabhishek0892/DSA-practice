package String;


public class reverseStringPreservingSpace {

    static String reverseWithSpacesIntact(String S)
    {
        int start = 0;
        int end = S.length() -1;
        char[] str = S.toCharArray();
        while (start<end){

            if (str[start] ==' '){
                start++;
                continue ;
            }
            else if (str[end]==' '){
                end --;
                continue;
            }
            else{
                char temp =str[start] ;
                str[start] = str[end];
                str[end] = temp;
                start ++;
                end --;
            }
        }
        return String.valueOf(str);
    }

    public static void main(String[] args) {
        System.out.println( reverseWithSpacesIntact("My name is Harsha"));

    }
}
