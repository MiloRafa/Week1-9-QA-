package com.company;

public class Main {

    public static void main(String[] args) {

	    Strings x;
	    x = new Strings();

	    x.printincrement();
	    x.count("shafeeq", "e");
        x.countWord("I am going to london", "am");
        x.reverse("I am going to london" , "");
        x.findandreplace("I am going to London", "London", "Japan");
        System.out.print(x.binary(255));

        }
    }

