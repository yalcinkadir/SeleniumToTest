package com.kadir.country;

import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<String>(); // Create an ArrayList object

        while (countries.size() < 3) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie ein Land ein: ");
            String country = scanner.nextLine();
            countries.add(country);

        }
        System.out.println(countries);

        for (String o : countries) {
            System.out.println(o);

            switch (o) {
                case "de":
                    //Calculator calculator = new Calculator();
                    System.out.println("Guten Morgen");
                    break;
                case "tr":
                    System.out.println("Günaydin");
                    break;
                case "en":
                    System.out.println("Good Morning");
                    break;
                default:
                    System.out.println("Falsche Eingabe");

            }
        }
    }
}
