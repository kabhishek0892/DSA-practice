package String;

public class ReverseStringWordByWord {


    static String reverseWordByWord(String str){
      int strLength = str.length()-1;
      String reverse ="",temp ="";

      for(int i=0;i<=strLength;i++)
      {
          temp= temp + str.charAt(i);

          if((str.charAt(i)==' ')||(i==strLength) ){
              for(int j=temp.length()-1;j>=0;j--)
              {
                     reverse = reverse + temp.charAt(j);
                   if((j==0) && (i!=strLength))
                        reverse= reverse + " ";
              }
              temp ="";
          }
      }
        return reverse;
    }
    public static void main(String[] args) {
        String str = "This is my first round in Rupeek";
        String revStr = reverseWordByWord(str);
        System.out.println(revStr);
    }
}
