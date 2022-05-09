package com.kadir.alarm;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalTime;

public class Alarm {

    static LocalTime setTime = LocalTime.of(13, 15, 0, 0);

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
