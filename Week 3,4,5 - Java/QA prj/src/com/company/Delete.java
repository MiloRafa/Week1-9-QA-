package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;

public class Delete implements ActionListener {

    TextField txt1, txt2, txt3;
    Frame fr3;

    //constructor for the delete field and frame
    public Delete(TextField t1, TextField t2, TextField t3, Frame fr3)
    {
        txt1 = t1; txt2 = t2; txt3 =t3;
        this.fr3 = fr3;
    }

    //event handler for the Delete button once pressed
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

            if (BR.getLabel().equals("Delete"))
            {
                S.executeUpdate("DELETE FROM qa WHERE regno="+ RegNo+"");
            }
        }
        catch (Exception t)
        {
            System.out.println(t.toString());
        }
        fr3.dispose();
    }
}
