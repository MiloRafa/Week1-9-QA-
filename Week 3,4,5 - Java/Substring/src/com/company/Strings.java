package com.company;

public class Strings {
    public void printincrement() {
        System.out.println("");
        System.out.println("EXERCISE 1");
        System.out.println("__________");
        System.out.println("");

        int a;
        String message = "SHAFEEQ";

        for (int x = 0; x < message.length(); x++) {
            System.out.println(message.substring(0, x + 1));

        }
    }

    public void count(String message, String wth) {
        System.out.println("");
        System.out.println("EXERCISE 2");
        System.out.println("__________");
        System.out.println("");

        int i, num;
        i = num = 0;
        for (; i < message.length(); i++) {
            String alpha;
            alpha = message.substring(i, i + 1);
            if (alpha.equals(wth)) {
                num++;
            }
        }

        System.out.println("there are " + num + " instances of " + wth + " in " + message);
    }

    public void countWord(String message, String wth) {
        System.out.println("");
        System.out.println("EXERCISE 3");
        System.out.println("__________");
        System.out.println("");

        int i, num;
        i = num = 0;
        for (; i <= message.length() - wth.length(); i++) {
            String alpha;
            alpha = message.substring(i, i + wth.length());
            if (alpha.equals(wth)) {
                num++;
                i = i + wth.length();


            }
        }

        System.out.println("there are " + num + " instances of " + wth + " in " + message);
    }

    public void reverse(String message, String wth) {
        System.out.println("");
        System.out.println("EXERCISE 4");
        System.out.println("__________");
        System.out.println("");

        int i, num;
        i = num = 0;
        String word = "";
        for (i = message.length() - 1; i >= 0; i--) {
            if (message.substring(i, i + 1).equals(" ")) {
                System.out.println(word);
                word = "";
            } else {
                word = message.substring(i, i + 1) + word;
            }

        }
        System.out.println(word);
    }


    public void findandreplace(String message, String findstring, String replacestring) {
        System.out.println("");
        System.out.println("EXERCISE 5");
        System.out.println("__________");
        System.out.println("");

        int i, num;
        i = num = 0;
        String word = "";
        for (i = 0; i < message.length(); i++)
        {
            if (message.substring(i, i + 1).equals(" "))
            {
                if (word.equals(findstring))
                {
                    System.out.print(replacestring + " ");
                }

                else{
                    System.out.print(word + " ");
                }
                word = "";
            } else
            {
                word = word + message.substring(i, i + 1);
            }
            // if word equals the word we're looking for then replace it


            }
        if (word.equals(findstring))
        {
            System.out.print(replacestring + " ");
        }

        else {
            System.out.print(word + " ");
        }

        }

    public String binary (int number ) {

        System.out.println("");
        System.out.println("");
        System.out.println("EXERCISE 6");
        System.out.println("__________");
        System.out.println("");

        String result = "";
        int x;

        while ( number > 0) {
            x = number%2;
            if (x == 0){
                //print a 0
                result = x + result;
            }

            else if (x == 1) {
                //print a 1
                result = x + result;
            }

            number = number/2;
        }

        // if the integer is .... divide by 2 till number equals 1 or 0
            return result;
    }

    }



