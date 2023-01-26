package timer;

import java.util.Scanner;

public class Account_Maintain {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number");
        long accNo = sc.nextLong();

        System.out.println("Enter amount");
        double amt = sc.nextDouble();

        System.out.println("Enter Transaction Type");
        String txType = sc.next();

    AccountTransaction accountTransaction1 = new AccountTransaction(1001,2500,"cr");
    AccountTransaction accountTransaction2 = new AccountTransaction(1002,8000,"dr");


    }
}
