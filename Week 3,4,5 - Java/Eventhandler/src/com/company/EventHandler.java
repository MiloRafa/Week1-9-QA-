package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandler implements ActionListener{

    TextField text1; //create a new variable so it can be seen through the class


    public EventHandler (TextField t){ //t can only be seen locally within the constructor

        text1 = t; // so t can be seen throughout


    }

    public void actionPerformed(ActionEvent e){

        Button b1 = (Button) e.getSource();
        //brackets is declaring the type - saying the rv is b1 and is of type button
        //getSource gets the reference variable of the button that was clicked

        System.out.print("Hello");

        if (b1.getLabel().equals("Hi")) {


        }

    }

}
