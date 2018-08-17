package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    static Connection C;

    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            C = DriverManager.getConnection("jdbc:mysql://localhost:3305/qa","root","");
            Statement S = C.createStatement();
            ResultSet R = S.executeQuery("SELECT * FROM qa");

            while (R.next()) {
                System.out.print(R.getInt("RegNo") + " ");
                System.out.print(R.getString("Name") + " ");
                System.out.println(R.getInt("Marks") + " ");

            }
            //S.executeUpdate("INSERT into qa VALUES (15,'ABC',95)");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        Frame fr1 = new Frame("QA Practice");
        fr1.setVisible(true);
        fr1.setSize(300,400);

        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();

        p2.setLayout( new GridLayout(4,1,0, 25));

        Button b1 = new Button("ENTRY");
        Button b2 = new Button("VIEW");
        Button b3 = new Button("EDIT");
        Button b4 = new Button("DELETE");

        p2.add(b1); //aligns to frame
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);

        //Labels to add space to the GUI
        Label l1 = new Label("");
        Label l2 = new Label("");
        Label l3 = new Label("");
        Label l4 = new Label("");
        Label l5 = new Label("");
        Label l6 = new Label("");
        Label l7 = new Label("");
        Label l8 = new Label("");
        Label l9 = new Label("");
        Label l20 = new Label("");
        Label l21 = new Label("");
        Label l22 = new Label("");

        //East GUI
        p3.add(l1);
        p3.add(l2);
        p3.add(l3);
        p3.add(l4);

        //West GUI
        p4.add(l5);
        p4.add(l6);
        p4.add(l7);
        p4.add(l8);

        //South GUI
        p5.add(l9);
        p5.add(l20);
        p5.add(l21);
        p5.add(l22);

        fr1.add(p1,BorderLayout.NORTH);
        fr1.add(p2, BorderLayout.CENTER);
        fr1.add(p3,BorderLayout.EAST);
        fr1.add(p4,BorderLayout.WEST);
        fr1.add(p5,BorderLayout.SOUTH);

        EventHandler x = new EventHandler();
        b1.addActionListener(x);
        b2.addActionListener(x);
        b3.addActionListener(x);
        b4.addActionListener(x);

        fr1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
