package com.kadir.zweierpotenzen;

public class Zweierpotenzenv2 {

    public static void main(String[] args) {

        int count = 0;

        for(int i=1; i<1050000; i=i*2){
            count = count + 1;
            System.out.println(count + " " + i);
        }
    }
}
