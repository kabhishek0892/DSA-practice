package ArraysTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupSameNumber {

    public static void main(String[] args) {
        //ip= 4,4,1,6,6,6,1,1,1,1
        // Print[[4,4],[1],[6,6,6],[1,1,1,1]
        List<List<Integer>> result = new ArrayList<>();

        int[] input = {4, 4, 1, 6, 6, 6, 1, 1, 1, 1};
        int n = input.length;
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; ) {

            List<Integer> l = new ArrayList<>();
            if (i + 1 < n && input[i] == input[i + 1]) {
                while (i + 1 < n && input[i] == input[i + 1]) {
                    l.add(input[i]);
                    i++;
                }
                l.add(input[i]);
            } else {

                l.add(input[i]);
            }
            i++;
            res.add(l);
        }
        System.out.println(res);
    }
}
