package com.Kadir.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Scanner scannerOperator = new Scanner(System.in);
        System.out.println("+ - * /");
        String operation = scannerOperator.nextLine();

        Integer x = getFirstZahl();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die zweite Zahl ein: ");
        Integer y = scanner.nextInt();

     /*   if (operation.equalsIgnoreCase("+")) {

            Calculator calculator = new Calculator();
            Integer sum = calculator.addOperator(x, y);
            System.out.println(x + " + " + y + " = " + sum);
        } else {
            System.out.println("Geben Sie nur + - * / ein!");
        }
*/
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die erste Zahl ein: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException error) {
            System.out.println("Falsche Eingabe!");
            getFirstZahl();
        }
        return 0;
    }


}
