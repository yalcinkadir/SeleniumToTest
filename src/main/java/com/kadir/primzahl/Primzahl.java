package com.kadir.primzahl;

public class Primzahl {

    public static void main(String[] args) {

        int zahl = 1277;
        boolean isPrim = true;

        for(int i=2; i<=10; i++){
            if (zahl != i && zahl % i == 0){
                System.out.println("keine Primzahl ");
                isPrim = false;
                break;
            }
        }
        if (isPrim) {
            System.out.println("Primzahl");
        }

    }
}
