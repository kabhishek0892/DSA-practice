package ArraysTest;

import java.util.ArrayList;
import java.util.Random;

public class randomNoeverytime {

    static int RandomNo(){
    Random random = new Random();
    // int randomNum = rand.nextInt((max - min) + 1) + min;
    int rno = random.nextInt(6);

    return rno;
}

    public static void main(String[] args) {

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        while (arrayList.size() < 3) { // how many numbers u need - it will 3
            int a = random.nextInt(6)+0; // this will give numbers between 1 and 6.

            if (!arrayList.contains(a)) {
                arrayList.add(a);
            }
        }
        System.out.println(arrayList);
    }
}
