package com.kadir.decimalFormat;

import java.text.DecimalFormat;

public class DecimalFormatMain {

    public static void main(String[] args) {

        DecimalFormat decFormat = new DecimalFormat();
        decFormat.setMaximumIntegerDigits(0);
        decFormat.setMaximumFractionDigits(3);
        decFormat.setMinimumFractionDigits(3);

        double d = 1234567.89;
        System.out.println(decFormat.format(d));
    }
}
