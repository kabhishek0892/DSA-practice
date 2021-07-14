public class TestInterview {
//meesho
    //to generate null pointer exception and handle it and show your message and after that -- > sum the two numbers
    //Reverse a sentence -- > each word should be reversed



    public static void main(String[] args) {
        try {
        String s = null;
        System.out.println(s.toLowerCase());

    }
        catch (NullPointerException e)
        {
            e.printStackTrace();
            String s="This is Abhishek";
            String sarray[] =s.split(" ");
            for(int i=0;i<sarray.length;i++)
            {
                StringBuilder sb = new StringBuilder(sarray[i]);
                sarray[i]= sb.reverse().toString();
                System.out.print(sarray[i] + " ");
            }
        }
        catch (Exception e1)
        {
            e1.printStackTrace();
        }

    }
}



