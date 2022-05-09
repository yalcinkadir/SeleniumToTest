package com.kadir.forTest;

public class TestFor {

    public static void main(String[] args) {

        int y = 1;

        for (int i = 1; i < 100; i++) {
            y *= i + 3; //hiiiiic olmuyor
            if (i != y) {
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("it is a number, what mod to 3 and 7");
                } else {
                    continue;
                }
            } else {
                break;
            }
            System.out.println(i);
        }


    }
}
