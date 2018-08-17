package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

public class Save implements ActionListener {

    TextField txt1, txt2, txt3;
    Frame fr2;

    //constructor for the save text field and frame
    public Save(TextField t1, TextField t2, TextField t3, Frame fr2)
    {
        txt1 = t1; txt2 = t2; txt3 =t3;
        this.fr2 = fr2;
    }

    //event handler for the save button once pressed
    public void actionPerformed(ActionEvent e)
    {
        String RegNo = txt1.getText();
        String Name = txt2.getText();
        String Marks = txt3.getText();

        try
        {
            Connection c = Main.C;
            Button BR = (Button) e.getSource();
            Statement S = c.createStatement();

            if (BR.getLabel().equals("Save"))
            {
                S.executeUpdate("INSERT into qa VALUES ("+ RegNo+",'"+Name+"',"+Marks+")");
            }
        }
        catch (Exception t)
        {
            System.out.println(t.toString());
        }
        fr2.dispose();
    }
}
