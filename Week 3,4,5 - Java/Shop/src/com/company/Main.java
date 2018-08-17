package com.company;

public class Main {

    public static void main(String[] args) {
        shop();
    }

    public static void shop() {
        int bill, paid, balance;
        bill = 120;
        paid = 1000;
        balance = paid - bill;

        System.out.println("Bill: £" + bill + "  Paid £: " + paid);
        System.out.println("Balance: £" + balance);
        System.out.println();
        if (balance >= 5000) {
            System.out.println("Number of £50 Notes:  " + balance / 5000);
            balance %= 5000;
        }

        if (balance < 5000)
        {
            System.out.println("Number of £20 Notes:  " + balance / 2000);
            balance %= 2000;
        }

        if (balance < 2000)
        {
            System.out.println("Number of £10 Notes:  " + balance / 1000);
            balance %= 1000;
        }

        if (balance < 1000)
        {
            System.out.println("Number of £5 Notes:  " + balance / 500);
            balance %= 500;
        }

        if (balance < 500)
        {
            System.out.println("Number of £2 Coins:  " + balance / 200);
            balance %= 200;
        }

        if (balance < 200)
        {
            System.out.println("Number of £1 Coins:  " + balance);

        }

        if (balance >= 50 && balance< 100)
        {
            System.out.println("Number of £50p:  " + balance / 50);
            balance %= 100;
        }

        if (balance >= 20 && balance< 50)
        {
            System.out.println("Number of £20p:  " + balance / 20);
        }

        if (balance >= 20 && balance< 10)
        {
            System.out.println("Number of £10p:  " + balance / 10);
        }

        if (balance >= 10 && balance< 5)
        {
            System.out.println("Number of £5p:  " + balance / 5);
        }

        if (balance >= 5 && balance< 2)
        {
            System.out.println("Number of £2p:  " + balance / 2);
        }
    }
}
