package com.company;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Frame window = new Frame("");
        window.setVisible(true);


        //BorderLayout border = new BorderLayout();
        //frame.setLayout(border);

        FlowLayout flow = new FlowLayout();
        window.setLayout(flow);

        window.setSize(500,500);

        Button b1 = new Button("Hi");
        Button b2 = new Button("Bye");
        Button b3 = new Button("Just no.");

        TextField t1 = new TextField();

        window.add(b1); //aligns to frame
        window.add(b2);
        window.add(b3);
        window.add(t1);

        t1.setText("Boo");

        EventHandler x = new EventHandler(t1);
        b1.addActionListener(x);
        b2.addActionListener(x);




    }
}
