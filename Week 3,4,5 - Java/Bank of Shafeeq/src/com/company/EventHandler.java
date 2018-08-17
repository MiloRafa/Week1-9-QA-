package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class EventHandler implements ActionListener
{
    TextField txt1, txt2;

    public EventHandler(TextField t1, TextField t2)
    {
        txt1 = t1; txt2 = t2;
    }

    public void actionPerformed(ActionEvent e)
    {
        String Email = txt1.getText();
        String Password = txt2.getText();

        try
        {
            Connection c = Main.C;
            Button BR = (Button) e.getSource();
            Statement S = c.createStatement();

            if (BR.getLabel().equals("Log in"))
            {
                ResultSet R = S.executeQuery("SELECT * FROM bankofqa WHERE Email=" + Email + "and Password=" + Password);
                while(R.next())
                {
                    if(Email.equals(R.getString("Email") && Password.equals(R.getString("Password"))))
                    {
                        txt2.setText(R.getString("Name"));

                        txt1.setVisible(true);
                        txt2.setVisible(true);
                    }
                }
            }
        }
        catch (Exception t)
        {
            System.out.println(t.toString());
        }
    }
}
