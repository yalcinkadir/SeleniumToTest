package com.kadir.person;

import java.util.Scanner;

import static java.lang.System.in;

public class Person2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(in);
        System.out.println("I am a \n" +
                "1 man\n2 woman\n");
        String sexScanner = scanner.next();

        switch(sexScanner) {
            case "1":
                System.out.println("Thank you Mr.");
                break;
            case "2":
                Scanner scanner1 = new Scanner(in);
                System.out.println("How old are you?");
                int age = Integer.parseInt(scanner1.next());
                if(age<=18){
                    System.out.println("Nice to meet you Ms.");
                } else {
                    System.out.println("Nice to meet you Mrs.");
                }
                break;
            default:
                System.out.println("No such verse. Please try again.");
                break;
        }


    }
}
