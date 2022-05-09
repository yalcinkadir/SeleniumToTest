package com.kadir.testString;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class TestString {

    public static void main(String[] args) {

        out.print("What's the password?     ");
        Scanner scanner = new Scanner(in);
        String password = scanner.next();
        out.println("You typed >>" + password + "<<");
        out.println();

        boolean pass = password.equals("swordfish");

        if (!pass) {
            out.println("your given password is false");
        }
        if (pass) {
            out.println("Bravo! correct password");
        }
        out.println();
        scanner.close();
    }
}
