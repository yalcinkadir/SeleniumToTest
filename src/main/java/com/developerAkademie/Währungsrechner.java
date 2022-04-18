package com.developerAkademie;
import java.util.Scanner;

public class Währungsrechner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte! Geben Sie einen Betrag in EUR ein!");
        Double money = scanner.nextDouble();

        convertToDollars(money);
        convertToYen(money);
    }

    public static void convertToDollars(Double eur){
        System.out.println(eur * 1.20);
    }
    public static void convertToYen(Double yen){
        System.out.println(yen * 132.31);
    }
}
