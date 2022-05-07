package com.kadir.isAge;

public class IsAge {

    public static void main(String[] args) {
        char name = 'y';
        int age = 0;
        boolean checkIsZero = age <= 1 && age >= 0;

       name = Character.toUpperCase(name);
        System.out.println(name + " is under 1? " + checkIsZero);
    }



}
