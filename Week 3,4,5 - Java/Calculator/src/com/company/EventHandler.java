package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EventHandler implements ActionListener {

    TextField text1; //create a new variable so it can be seen through the class

    int x;

    String LastOp = "";

    int Result;


    public EventHandler (TextField t) { //t can only be seen locally within the constructor

        text1 = t; // so t can be seen throughout


    }

    public void actionPerformed(ActionEvent e){

        Button BR = (Button) e.getSource();  //brackets is declaring the type - saying the rv is b1 and is of type button
        //getSource gets the reference variable of the button that was clicked



        if (BR.getLabel().equals("0")) {
            text1.setText(text1.getText() + "0");   //concatenate the number already entered and the new number clicked

        }


        if (BR.getLabel().equals("1")){
            text1.setText(text1.getText() + "1");

        }

        if (BR.getLabel().equals("2")){
            text1.setText(text1.getText() + "2");

        }

        if (BR.getLabel().equals("3")){
            text1.setText(text1.getText() + "3");

        }

        if (BR.getLabel().equals("4")){
            text1.setText(text1.getText() + "4");

        }

        if (BR.getLabel().equals("5")) {
            text1.setText(text1.getText() + "5");
        }

        if (BR.getLabel().equals("6")){
                text1.setText(text1.getText() + "6");
        }

        if (BR.getLabel().equals("7")){
            text1.setText(text1.getText() + "7");
        }

        if (BR.getLabel().equals("8")){
            text1.setText(text1.getText() + "8");
        }

        if (BR.getLabel().equals("9")){
            text1.setText(text1.getText() + "9");
        }


        if (BR.getLabel().equals("+")) {

            x = Integer.parseInt(text1.getText()); //get string from text field and converts to integer (to add)

            text1.setText(""); //clear

            LastOp = BR.getLabel(); // saving the last operation used

        }

        if (BR.getLabel().equals("-")) {

            x = Integer.parseInt(text1.getText()); //get string from text field and converts to integer (to add)

            text1.setText(""); //clear

            LastOp = BR.getLabel(); // saving the last operation used
        }

        if (BR.getLabel().equals("÷")) {
            x = Integer.parseInt(text1.getText()); //get string from text field and converts to integer (to add)

            text1.setText(""); //clear

            LastOp = BR.getLabel(); // saving the last operation used

        }

        if (BR.getLabel().equals("X")) {

            x = Integer.parseInt(text1.getText()); //get string from text field and converts to integer (to add)

            text1.setText(""); //clear

            LastOp = BR.getLabel(); // saving the last operation used

        }

        if (BR.getLabel().equals("=")) {


            if (LastOp.equals("+")){

                Result = Integer.parseInt(text1.getText()) + x;

                text1.setText(Integer.toString(Result));
            }

            if (LastOp.equals("-")){

                Result = Integer.parseInt(text1.getText()) - x;

                text1.setText(Integer.toString(Result));
            }

            if (LastOp.equals("X")){

                Result = Integer.parseInt(text1.getText()) * x;

                text1.setText(Integer.toString(Result));
            }

            if (LastOp.equals("÷")){

                Result = Integer.parseInt(text1.getText()) / x;

                text1.setText(Integer.toString(Result));
            }

        }

        if (BR.getLabel().equals("CLEAR")) {

            text1.setText("");

            Result = 0;

            x = 0;

            LastOp = "";
        }


    }
}
