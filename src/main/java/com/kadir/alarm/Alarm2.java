package com.kadir.alarm;

import java.time.LocalTime;

public class Alarm2 {

    static LocalTime setTime = LocalTime.of(21, 45, 0, 0);

    public static void main(String[] args) throws InterruptedException {
        time();
    }

    public static void time() throws InterruptedException {
        Thread.sleep(1000);
        if (setTime.getMinute() == LocalTime.now().getMinute()) {
            System.out.println("ALARM ALARM ALARM\n" +
                    "ALARM ALARM ALARM\n" +
                    "ALARM ALARM ALARM");

        } else {
            System.out.println("Waiting for alarm " + LocalTime.now().getSecond());
            time();
        }
    }
}
