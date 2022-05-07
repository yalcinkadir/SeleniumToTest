package com.kadir.intNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static java.lang.System.out;

public class IntNumbers {
    IntNumbers intNumbers = new IntNumbers();

    public static void scanner(int generateNumber) {
        Scanner scanner = new Scanner(System.in);
        out.print("Give me a number: ");
        int scannerNumber = scanner.nextInt();

        if (scannerNumber == generateNumber) {
            out.println("******\nyou win\n******");
        } else {
            out.println("try again");
            scanner(generateNumber);
        }

    }

    public static int random() {
        int randomNumber = new Random().nextInt(10) + 1;
        return randomNumber;
    }

    public static void main(String[] args) {

        scanner(random());

        ArrayList<Integer> integerArrayList = new ArrayList<>(Arrays.asList(5, 10, 15));

        Integer x = 3;
        int y = 3;

        System.out.println(x);
        System.out.println(y);

        String s = x.toString();

        if (s.equals("3")) {
            System.out.println("my number is a String 3");
        } else {
            System.out.println("are you kidding me!");
        }

        integerArrayList.forEach(System.out::println);
        integerArrayList.forEach(ArrayListForEach -> System.out.println(ArrayListForEach * 10));

        double d = y;
        System.out.println(d);
        System.out.println();

        int i = 10;
        System.out.println(i++);
        System.out.println(i);

        System.out.println(--i);
        --i;
        i--;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(i);
        i++;
        i = i++ + ++i;
        System.out.println(i);
        i = i++ + i++;
        System.out.println(i);
        System.out.println();

        i = 10;
        System.out.println(i);
        i += 2; //12
        i -= 5; //7
        i *= 6; //42
        System.out.println(i); //42
        System.out.println(i += 3); //45
        System.out.println(i /= 2); //22
        System.out.println();




    }
}