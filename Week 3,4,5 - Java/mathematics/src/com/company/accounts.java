package com.company;

public class accounts {
    private float tax(int salary)
    {
        float t = 0;
        if (salary < 1000)
        {
            t = 0;
        }
        else  if (salary >=1000 && salary< 2000)
        {
            t = salary * 0.15f;
        }
        else
        {
            t =salary * 0.21f;
        }
        return t;
    }

    public void netSalary(int salary)
    {
        System.out.println("Your Tax:" + tax(salary));
        System.out.println("Net Salary: " + (salary - tax(salary)));
    }
}
