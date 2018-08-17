package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {

    public static void main(String[] args) {
	// write your code here


        Frame window = new Frame("Calculator");
        window.setVisible(true);
        window.setSize(300,400);


        Panel p1 = new Panel();
        Panel p2 = new Panel();

        p2.setLayout( new GridLayout(4,4));


        Button b1 = new Button("0");
        Button b2 = new Button("1");
        Button b3 = new Button("2");
        Button b4 = new Button("3");
        Button b5 = new Button("4");
        Button b6 = new Button("5");
        Button b7 = new Button("6");
        Button b8 = new Button("7");
        Button b9 = new Button("8");
        Button b10 = new Button("9");
        Button b11 = new Button("+");
        Button b12 = new Button("-");
        Button b13 = new Button("X");
        Button b14 = new Button("÷");
        Button b15 = new Button("=");
        Button b16 = new Button("CLEAR");

        TextField t1 = new TextField(30);
        p1.add(t1);

        p2.add(b1); //aligns to frame
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        p2.add(b7);
        p2.add(b8);
        p2.add(b9);
        p2.add(b10);
        p2.add(b11);
        p2.add(b12);
        p2.add(b13);
        p2.add(b14);
        p2.add(b15);
        p2.add(b16);

        window.add(p1,BorderLayout.NORTH);
        window.add(p2);

        EventHandler x = new EventHandler(t1);

        b1.addActionListener(x);
        b2.addActionListener(x);
        b3.addActionListener(x);
        b4.addActionListener(x);
        b5.addActionListener(x);
        b6.addActionListener(x);
        b7.addActionListener(x);
        b8.addActionListener(x);
        b9.addActionListener(x);
        b10.addActionListener(x);
        b11.addActionListener(x);
        b12.addActionListener(x);
        b13.addActionListener(x);
        b14.addActionListener(x);
        b15.addActionListener(x);
        b16.addActionListener(x);






        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
