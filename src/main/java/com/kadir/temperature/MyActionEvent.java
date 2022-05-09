package com.kadir.temperature;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.out;

public class MyActionEvent implements ActionListener {
    MyFrame myFrame;

    public MyActionEvent(MyFrame myFrame) {
        this.myFrame = myFrame;
    }

    public void actionPerformed(ActionEvent e) {
        out.println("Click on the button");
        myFrame.dispose();
    }

}
