package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        JFrame fr1 = new JFrame("Account Open");
        fr1.setVisible(true);
        fr1.setSize(300,400);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();

        p2.setLayout( new GridLayout(4,1,0, 25));

        JLabel b1 = new JLabel("Name");
        TextField t1 = new TextField(20);
        JLabel b2 = new JLabel("Address");
        TextField t2 = new TextField(20);
        JRadioButton b3 = new JRadioButton("Male");
        TextField t3 = new TextField(20);
    }
}
