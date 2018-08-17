package com.company;

import javafx.beans.WeakInvalidationListener;
import org.omg.IOP.CodecPackage.InvalidTypeForEncoding;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        JFrame Window = new JFrame("Mathematical Calculations");

        JMenuBar Bar = new JMenuBar();

        JLabel l1 = new JLabel("            Number 1:");
        TextField t1 = new TextField(20);
        JLabel l2 = new JLabel("            Number 2:");
        TextField t2 = new TextField(20);
        JLabel l3 = new JLabel("            Result:");
        TextField t3 = new TextField(20);
        t3.setEditable(false);

        JMenu menu1 = new JMenu("Operations 1");
        JMenu menu2 = new JMenu("Operations 2");

        //****ADD****
        JMenuItem M1 = new JMenuItem("Addition");
        M1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(t1.getText());
                int j = Integer.parseInt(t2.getText());
                t3.setText(Integer.toString((i+j)));
            }
        });

        //****SUBTRACT****
        JMenuItem M2 = new JMenuItem("Subtraction");
        M2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(t1.getText());
                int j = Integer.parseInt(t2.getText());
//                try
//                {
//
//                }catch (Exception t)
//                {
//                    System.out.println(t.toString());
//                }
                t3.setText(Integer.toString((i-j)));
            }
        });

        //****MULTIPLY****
        JMenuItem M3 = new JMenuItem("Multiplication");
        M3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(t1.getText());
                int j = Integer.parseInt(t2.getText());
                t3.setText(Integer.toString((i*j)));
            }
        });

        //****DIVIDE****
        JMenuItem M4 = new JMenuItem("Division");
        M4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(t1.getText());
                int j = Integer.parseInt(t2.getText());
                t3.setText(Integer.toString((i/j)));
            }
        });

        menu1.add(M1);
        menu1.add(M2);
        menu2.add(M3);
        menu2.add(M4);

        Bar.add(menu1);
        Bar.add(menu2);

        Window.setJMenuBar(Bar);
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(3,2));

        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(t3);

        Window.add(p1);
        Window.setVisible(true);
        Window.setSize(600, 450);
    }
}
