package com.kadir.print;


public class Print {
    public static void main(String[] arguments) {
        print(1, "Martin");
        print(2, "Arthur");
        print(3, "Florian");
        print(4, "Robert");
    }

    public static void print(int zahl, String name) {
        System.out.println(zahl + ": " + name);
    }
}

