package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;

public class EventHandler implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        Button BR = (Button) e.getSource();

        //*****ENTRY RECORDS OPTION*****
        if (BR.getLabel().equals("ENTRY"))
        {
            Frame fr2 = new Frame("Enter Student Records");
            fr2.setVisible(true);
            fr2.setSize(400, 250);

            Panel p1 = new Panel();
            Panel center = new Panel();
            Panel east = new Panel();
            Panel west = new Panel();
            Panel south = new Panel();

            //Main Panel to work in
            center.setLayout(new GridLayout(3, 2));

            Label b1 = new Label("RegNo");
            TextField t1 = new TextField(20);
            Label b2 = new Label("Name");
            TextField t2 = new TextField(20);
            Label b3 = new Label("Marks");
            TextField t3 = new TextField(20);

            //Save new records
            Save s = new Save(t1, t2, t3, fr2);
            Button b4 = new Button("Save");
            b4.addActionListener(s);

            center.add(b1); //aligns to frame
            center.add(t1);
            center.add(b2);
            center.add(t2);
            center.add(b3);
            center.add(t3);

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
            east.add(l1);
            east.add(l2);
            east.add(l3);
            east.add(l4);

            //West GUI
            west.add(l5);
            west.add(l6);
            west.add(l7);
            west.add(l8);

            //South GUI
            south.add(l9);
            south.add(l20);
            south.add(l21);
            south.add(l22);
            south.add(b4);

            fr2.add(p1, BorderLayout.NORTH);
            fr2.add(center, BorderLayout.CENTER);
            fr2.add(east, BorderLayout.EAST);
            fr2.add(west, BorderLayout.WEST);
            fr2.add(south, BorderLayout.SOUTH);
            Closing E = new Closing(fr2);
            fr2.addWindowListener(E);
        }

        //*****DELETE RECORDS OPTION*****
        if (BR.getLabel().equals("DELETE"))
        {
            Frame fr3 = new Frame("Delete Student Records");
            fr3.setVisible(true);
            fr3.setSize(400, 250);

            Panel north = new Panel();
            Panel center = new Panel();
            Panel east = new Panel();
            Panel west = new Panel();
            Panel south = new Panel();

            //Main Panel to work in
            center.setLayout(new GridLayout(3, 2));

            Label b1 = new Label("RegNo");
            TextField t1 = new TextField(20);
            Label b2 = new Label("Name");
            TextField t2 = new TextField(20);
            t2.setEditable(false);
            Label b3 = new Label("Marks");
            TextField t3 = new TextField(20);
            t3.setEditable(false);

            //Show additional record linked with the entered RegNo
            more m = new more(t1, t2, t3, b1, b2, b3, fr3);
            Button b4 = new Button("More");
            b4.addActionListener(m);

            //Delete existing records
            Delete d = new Delete(t1, t2, t3, fr3);
            Button b5 = new Button("Delete");
            b5.addActionListener(d);

            b2.setVisible(false);
            t2.setVisible(false);
            b3.setVisible(false);
            t3.setVisible(false);

            center.add(b1); //aligns to frame
            center.add(t1);
            center.add(b2);
            center.add(t2);
            center.add(b3);
            center.add(t3);

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
            east.add(l1);
            east.add(l2);
            east.add(l3);
            east.add(l4);
            east.add(b4);

            //West GUI
            west.add(l5);
            west.add(l6);
            west.add(l7);
            west.add(l8);

            //South GUI
            south.add(l9);
            south.add(l20);
            south.add(l21);
            south.add(l22);
            south.add(b5);

            fr3.add(north, BorderLayout.NORTH);
            fr3.add(center, BorderLayout.CENTER);
            fr3.add(east, BorderLayout.EAST);
            fr3.add(west, BorderLayout.WEST);
            fr3.add(south, BorderLayout.SOUTH);
            Closing E = new Closing(fr3);
            fr3.addWindowListener(E);
        }

        //*****VIEW RECORDS OPTION*****
        if (BR.getLabel().equals("VIEW"))
        {
            Frame fr4 = new Frame("View Student Records");
            fr4.setVisible(true);
            fr4.setSize(400, 250);

            Panel north = new Panel();
            Panel center = new Panel();
            Panel east = new Panel();
            Panel west = new Panel();
            Panel south = new Panel();

            //Main Panel to work in
            center.setLayout(new GridLayout(3, 2));

            Label b1 = new Label("RegNo");
            TextField t1 = new TextField(20);
            Label b2 = new Label("Name");
            TextField t2 = new TextField(20);
            t2.setEditable(false);
            Label b3 = new Label("Marks");
            TextField t3 = new TextField(20);
            t3.setEditable(false);

            //Show records of the entered RegNo
            View v = new View(t1, t2, t3, b1, b2, b3, fr4);
            Button b4 = new Button("Check");
            b4.addActionListener(v);

            b2.setVisible(false);
            t2.setVisible(false);
            b3.setVisible(false);
            t3.setVisible(false);

            center.add(b1); //aligns to frame
            center.add(t1);
            center.add(b2);
            center.add(t2);
            center.add(b3);
            center.add(t3);

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
            east.add(l1);
            east.add(l2);
            east.add(l3);
            east.add(l4);
            east.add(b4);

            //West GUI
            west.add(l5);
            west.add(l6);
            west.add(l7);
            west.add(l8);

            //South GUI
            south.add(l9);
            south.add(l20);
            south.add(l21);
            south.add(l22);

            fr4.add(north, BorderLayout.NORTH);
            fr4.add(center, BorderLayout.CENTER);
            fr4.add(east, BorderLayout.EAST);
            fr4.add(west, BorderLayout.WEST);
            fr4.add(south, BorderLayout.SOUTH);
            Closing E = new Closing(fr4);
            fr4.addWindowListener(E);
        }

        //*****EDIT RECORDS OPTION*****
        if (BR.getLabel().equals("EDIT"))
        {
            Frame fr3 = new Frame("Edit Student Records");
            fr3.setVisible(true);
            fr3.setSize(400, 250);

            Panel north = new Panel();
            Panel center = new Panel();
            Panel east = new Panel();
            Panel west = new Panel();
            Panel south = new Panel();

            //Main Panel to work in
            center.setLayout(new GridLayout(3, 2));

            Label b1 = new Label("RegNo");
            TextField t1 = new TextField(20);
            Label b2 = new Label("Name");
            TextField t2 = new TextField(20);
            Label b3 = new Label("Marks");
            TextField t3 = new TextField(20);

            //Show records of the entered RegNo
//            Check v = new View(t1, t2, t3, b1, b2, b3, fr5);
//            Button b4 = new Button("Check");
//            b4.addActionListener(v);
//
//            //Update existing records
//            Update d = new Update(t1, t2, t3, fr3);
//            Button b5 = new Button("Delete");
//            b5.addActionListener(d);

            b2.setVisible(false);
            t2.setVisible(false);
            b3.setVisible(false);
            t3.setVisible(false);

            center.add(b1); //aligns to frame
            center.add(t1);
            center.add(b2);
            center.add(t2);
            center.add(b3);
            center.add(t3);

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
            east.add(l1);
            east.add(l2);
            east.add(l3);
            east.add(l4);
            //east.add(b4);

            //West GUI
            west.add(l5);
            west.add(l6);
            west.add(l7);
            west.add(l8);

            //South GUI
            south.add(l9);
            south.add(l20);
            south.add(l21);
            south.add(l22);
            //south.add(b5);

            fr3.add(north, BorderLayout.NORTH);
            fr3.add(center, BorderLayout.CENTER);
            fr3.add(east, BorderLayout.EAST);
            fr3.add(west, BorderLayout.WEST);
            fr3.add(south, BorderLayout.SOUTH);
            Closing E = new Closing(fr3);
            fr3.addWindowListener(E);
        }
    }
}
