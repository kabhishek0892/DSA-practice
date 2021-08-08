package String;

public class StringWordWithFrequency {
    public static void main(String[] args) {

        String str1 = "aaaabbcbaccc";
        StringBuilder sb = new StringBuilder();

        // a2b3c3a2
        int n = str1.length() - 1;

        int count = 1;
        int temp;
        for (int i = 0; i < n; i++) {
            if (str1.charAt(i + 1) == str1.charAt(i)) {

                count++;

            }

            if (str1.charAt(i + 1) != str1.charAt(i)) {
                sb.append(str1.charAt(i) + "" + count);

                count = 1;

            }

        }
        System.out.println(sb);
    }
}
