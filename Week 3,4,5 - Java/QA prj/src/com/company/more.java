package com.company;

import javax.naming.Name;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class more implements ActionListener
{
    TextField txt1, txt2, txt3;
    Frame fr3;
    Label lbl1, lbl2, lbl3;

    public more(TextField t1, TextField t2, TextField t3, Label b1, Label b2, Label b3, Frame fr3)
    {
        txt1 = t1; txt2 = t2; txt3 =t3;
        lbl1 = b1; lbl2 = b2; lbl3 = b3;
        this.fr3 = fr3;
    }

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

            if (BR.getLabel().equals("More"))
            {
                ResultSet R = S.executeQuery("SELECT * FROM qa WHERE regno=" + RegNo);
                while(R.next())
                {
                    if(RegNo.equals(Integer.toString(R.getInt("RegNo"))))
                    {
                        txt2.setText(R.getString("Name"));
                        txt3.setText(Integer.toString(R.getInt("Marks")));

                        //RegNo
                        txt1.setVisible(true);
                        lbl1.setVisible(true);
                        //name
                        txt2.setVisible(true);
                        lbl2.setVisible(true);
                        //marks
                        txt3.setVisible(true);
                        lbl3.setVisible(true);
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
