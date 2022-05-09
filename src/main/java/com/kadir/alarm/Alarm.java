package com.kadir.alarm;

import java.time.LocalTime;

public class Alarm {

    static LocalTime setTime = LocalTime.of(12, 26, 0, 0);

    public static void main(String[] args) {

        while (true) {
            LocalTime currentTime = LocalTime.now();
            if (currentTime.equals(setTime)) {
                System.out.println("Alarm Alarm Alarm");
                System.out.println("Alarm Alarm Alarm");
                System.out.println("Alarm Alarm Alarm");
                break;
            }
        }
    }
}
