package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    static Connection C;
    public static void main(String[] args)
    {
	// write your code here
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            C = DriverManager.getConnection("jdbc:mysql://localhost:3305/bankofqa","root","");
            Statement S = C.createStatement();
            ResultSet R = S.executeQuery("SELECT * FROM user_login ");

            while (R.next())
            {
                System.out.print(R.getString("Email") + " ");
                System.out.println(R.getString("Password") + " ");
            }
//            S.executeUpdate("INSERT into user_login VALUES ('w@hotmail.com','hi')");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        JFrame frame1 = make_frame();
    }

    static JFrame make_frame() {
        JFrame frame1 = new JFrame("Bank Of QA");

        JPanel panel1 = new JPanel();
        frame1.add(panel1);
        JPanel panel2 = new JPanel();
        frame1.add(panel2);

        panel1.setLayout( new GridLayout(2,0));

        JLabel label1 = new JLabel("Email");
        panel1.add(label1);
        JTextField t1 = new JTextField(20);
        panel1.add(t1);

        JLabel label2 = new JLabel("Password");
        panel1.add(label2);
        JTextField t2 = new JTextField(20);
        panel1.add(t2);

        JButton button1 = new JButton("Log in");
        panel2.add(button1);
        frame1.add(panel2, BorderLayout.SOUTH);
        frame1.setLayout(new FlowLayout(1, 40, 30));


        frame1.setVisible(true);
        frame1.setSize(600,400);

        EventHandler x = new EventHandler();
        button1.addActionListener(x);

        return frame1;
    }

    static JFrame make_frame2() {
        JFrame frame1 = new JFrame("Bank Of QA");

        JPanel panel1 = new JPanel();
        frame1.add(panel1);
        JPanel panel2 = new JPanel();
        frame1.add(panel2);

        panel1.setLayout( new GridLayout(2,0));

        JLabel label1 = new JLabel("Email");
        panel1.add(label1);
        JTextField t1 = new JTextField(20);
        panel1.add(t1);

        JLabel label2 = new JLabel("Password");
        panel1.add(label2);
        JTextField t2 = new JTextField(20);
        panel1.add(t2);

        JButton button1 = new JButton("Log in");
        panel2.add(button1);
        frame1.add(panel2, BorderLayout.SOUTH);
        frame1.setLayout(new FlowLayout(1, 40, 30));

        JMenuBar Bar1 = new JMenuBar();
        frame1.setJMenuBar(Bar1);

        JMenu menu2 = new JMenu("User");
        Bar1.add(menu2);
        JMenu menu1 = new JMenu("Admin");
        Bar1.add(menu1);

        JMenuItem submenu1 = new JMenuItem("Deposit");
        submenu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menu2.add(submenu1);

        JMenuItem submenu2 = new JMenuItem("Withdraw");
        submenu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menu2.add(submenu2);

        JMenuItem submenu3 = new JMenuItem("Transfer");
        submenu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menu2.add(submenu3);

        JMenuItem submenu4 = new JMenuItem("Reports");
        submenu1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        menu2.add(submenu4);

        frame1.setVisible(true);
        frame1.setSize(600,400);

        EventHandler x = new EventHandler();
        button1.addActionListener(x);

        return frame1;
    }

}
