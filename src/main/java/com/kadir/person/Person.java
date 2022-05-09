package com.kadir.person;

import java.util.Scanner;

import static java.lang.System.in;

public class Person {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        System.out.println("I am a \n" +
                "1 man\n2 woman\n");
        int sexScanner = Integer.parseInt(scanner.next());

        String greetingName = "";

        if (sexScanner == Sex.Mr.getValue()) {
            greetingName = "Mr.";
        } else if (sexScanner == Sex.Ms.getValue()) {
            Scanner scanner1 = new Scanner(in);
            System.out.println("How old are you? ");
            int age = Integer.parseInt(scanner1.next());

            if (age <= 18) {
                greetingName = "Ms.";
            } else {
                greetingName = "Mrs.";
            }
        }

        System.out.println("Hi! " + greetingName + "\nI am very excited to meet to you.");


    }


}
