package com.company;

import java.awt.event.WindowAdapter;
import java.awt.*;
import java.awt.event.*;

public class Closing extends WindowAdapter {
    Frame F;
    public Closing(Frame f){
        F=f;
    }
    public void windowClosing(WindowEvent A){
        F.setVisible(false);
    }
}
