package com.kadir.calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner scannerOperator = new Scanner(in);
        System.out.println("+ - * /");
        String operation = scannerOperator.next();

        Integer x = getFirstZahl();
        Integer y = getSecondZahl();

        switch (operation) {
            case "+":
                //Calculator calculator = new Calculator();
                Integer sum = Calculator.addOperator(x, y);
                System.out.println(x + " + " + y + " = " + sum);
                break;
            case "-":
                System.out.println("Not implemented");
                break;
            default:
                System.out.println("Falsche Eingabe");

        }
    }

    static Integer getFirstZahl() {
        Scanner scanner = new Scanner(in);
        System.out.println("Geben Sie die erste Zahl ein: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException error) {
            System.out.println("Falsche Eingabe!");
            getFirstZahl();
        }
        return 0;
    }

    static Integer getSecondZahl() {
        Scanner scanner = new Scanner(in);
        System.out.println("Geben Sie die zweite Zahl ein: ");
        return scanner.nextInt();
    }
}
