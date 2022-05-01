package com.Kadir.RollingDice;

import java.util.Date;
import java.util.Random;

public class RollingDice {

    public static void main(String[] args) {
        Random giveMeNumber = new Random();
        int x = giveMeNumber.nextInt(100) + 1;

        Date now = new Date();

        System.out.println(now + "\nyour Random Number: " + x);
    }
}
