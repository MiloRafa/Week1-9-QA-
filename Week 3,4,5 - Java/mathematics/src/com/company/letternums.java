package com.company;

public class letternums {
    public void numlet (int num) {

        if (num<20) System.out.println(ones(num));
        if (num>=20 && num <100)
        {
            System.out.println(tens(num/10*10) + " " + ones(num%10));
        }
        if (num>=100 && num <1000)
        {
            System.out.println(ones(num/100) + " Hundred " + tens(num%100/10*10) + " " + ones(num%100%10));
        }
        if (num>=1000 && num <10000)
        {
            System.out.println(ones(num/1000) + " Thousand " + tens(num%1000/100*100) + "" + ones(num%100%10) + tens(num%100/10*10) + " " + ones(num%100%10));
        }
    }

    private String ones (int num)
    {
        String numstring = "";
        switch (num)
        {
        case 1: numstring = "One";break;
        case 2: numstring = "Two";break;
        case 3: numstring = "Three";break;
        case 4: numstring = "Four";break;
        case 5: numstring = "Five";break;
        case 6: numstring = "Six";break;
        case 7: numstring = "Seven";break;
        case 8: numstring = "Eight";break;
        case 9: numstring = "Nine";break;
        case 10: numstring = "Ten";break;
        case 11: numstring = "Eleven";break;
        case 12: numstring = "Twelve";break;
        case 13: numstring = "Thirteen";break;
        case 14: numstring = "Fourteen";break;
        case 15: numstring = "Fifteen";break;
        case 16: numstring = "Sixteen";break;
        case 17: numstring = "Seventeen";break;
        case 18: numstring = "Eighteen";break;
        case 19: numstring = "Nineteen";break;
        }
        return numstring;
    }

    private String tens (int num)
    {
        String numstr = "";
        switch (num)
        {
            case 20: numstr = "Twenty";break;
            case 30: numstr = "Thirty";break;
            case 40: numstr = "Forty";break;
            case 50: numstr = "Fifty";break;
            case 60: numstr = "Sixty";break;
            case 70: numstr = "Seventy";break;
            case 80: numstr = "Eighty";break;
            case 90: numstr = "Ninety";break;
        }
        return numstr;
    }

    private String hunds (int num)
    {
        String numstr = "";
        switch (num)
        {
            case 200: numstr = "Two Hundred";break;
            case 300: numstr = "Three Hundred";break;
            case 400: numstr = "Four Hundred";break;
            case 500: numstr = "Five Hundred";break;
            case 600: numstr = "Six Hundred";break;
            case 700: numstr = "Seven Hundred";break;
            case 800: numstr = "Eight Hundred";break;
            case 900: numstr = "Nine Hundred";break;
        }
        return numstr;
    }
}


