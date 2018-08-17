package com.company;

public class Main {

    public static void main(String[] args) {
	//bigflow();
        //twotable();
	//loop();
       // sequence();
        //desc();
        twotimes();
    }


    public static void bigflow()
    {
        int x;
        x = 562;

        if(x > 1000)
        {
            System.out.println("A");
            if (x > 5000)
            {
                System.out.println("B");
            }
            else
            {
                System.out.println("C");
            }
            System.out.println("E");
            if (x < 2000)
            {
                System.out.println("F");
                System.out.println("G");
            }
        }
        else
        {
            if(x < 500)
            {
                System.out.println("1");
                System.out.println("2");
            }
                if (x > 200)
                {
                    System.out.println("3");
                if(x >300)
                {
                    System.out.println("4");
                }
            }
            else
            {
                System.out.println("5");
            }
        }
        System.out.println("6");
    }


    public static void twotable()
    {
        int x;
        x = 1;

        while (x <=10)
        {
            System.out.println("2x" + x + " = " + (x*2));
            x++;
        }
    }

    public static void loop()
    {
        int x;
        x = 1;

        while (x <=100)
        {
            if(x%2 == 0)
            {
                System.out.println(x);
            }
            x = x + 1;
        }
    }

    public static void sequence()
    {
        int x = 1;
        int y;

        while (x <= 10)
        {
            y = 1;
            while (y <= x)
            {
                System.out.print(y + ",");
                y = y + 1;
            }
            System.out.println(x + ".");
            x++;
        }
    }

    public static void desc()
    {
        int a = 10;
        int b;

        while (a >= 0)
        {
            b = 1;
            while (b <= a) {
                System.out.print(b);
                b++;
            }
            System.out.println(b + ".");
            a--;
        }
    }

    public static void twotimes()
    {
        for(int i = 1; i <= 20; i++)
        {
            System.out.println("Time Tables of:" + i);
            for(int a=1; a <=12; a++)
                System.out.println(i + " x " +a +" = "+(a*i));
            System.out.println();
        }
    }
}
