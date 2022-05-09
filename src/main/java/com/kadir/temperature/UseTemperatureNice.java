package com.kadir.temperature;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.System.out;

public class UseTemperatureNice {

    static MyFrame myFrame = new MyFrame();

    public static void main(String[] args) {

        UseTemperatureNice useTemperatureNice = new UseTemperatureNice();

        JButton button = new JButton("Panic");
        myFrame.add(button);
        myFrame.setSize(300, 100);
        myFrame.setVisible(true);
        MyActionEvent myActionEvent = new MyActionEvent(myFrame);
        button.addActionListener(myActionEvent);

        final String format = "%5.2f degrees %s calculated for %s\n";

        TemperatureNice temp = new TemperatureNice(18);
        out.println(temp.getNumber());
        out.println(temp.isSunnyDay());

        //out.printf(format, temp.getNumber(), temp.getScale(), "child");

        //out.println(temp.getNumber() + " degrees " + temp.getScale() + " calculated for child" );

        // temp = new TemperatureNice(32.0);

        //out.printf(format, temp.getNumber(), temp.getScale(), "adult");

        //temp = new TemperatureNice(TempScale.CELSIUS);

        // out.printf(format, temp.getNumber(), temp.getScale(), "adult");

        //temp = new TemperatureNice(2.73, TempScale.KELVIN);

        //out.printf(format, temp.getNumber(), temp.getScale(), "adult");

    }

}
