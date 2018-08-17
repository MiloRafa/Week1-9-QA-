package com.company;

public class Main {

    public static void main(String[] args) {
	//Temp();
        // oe();
        //salary();
        //twodigs();
        //threedigs();
        flow();
    }

    public static void Temp()
    {
        int temp;
        temp = 41;
        if (temp >40)
        {
            System.out.println("It");
            System.out.println("is");
            System.out.println("Warm");
        }
    }

    public static void oe()
    {
        int num = 98;
        if (num % 2 ==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }

    public static void salary()
    {
        int salary;
        salary = 2000;
        float tax = 0, net = 0;

        if (salary < 1000)
        {
            tax = salary * 0.05f;
        }

        if (salary >= 1000 && salary < 2000)
        {
            tax = salary * 0.15f;
        }

        if (salary >= 2000 && salary < 3000)
        {
            tax = salary * 0.17f;
        }

        if (salary >= 3000 && salary < 4000)
        {
            tax = salary * 0.21f;
        }

        if (salary > 4000)
        {
            tax = salary * 0.25f;
        }

        net = salary-tax;
        System.out.println(net);
    }

    public static void twodigs()
    {
        int x;
        x = 12;

        System.out.println(x/10 + x%10);
    }

    public static void threedigs()
    {
        int x;
        x = 123;

        System.out.println(x/100 + (x%100)/10 + x%10);
    }

    public static void flow()
    {
        int x;
        x = 11;

        if (x > 10)
        {
            System.out.println("A");
            if (x > 20)
            {
                System.out.println("C");
            }
        }
        else
        {
            System.out.println("B");
        }
    }
}
