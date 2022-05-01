package com.Kadir.Zweierpotenzen;

public class Zweierpotenzen {

    public static void main(String[] args) {
        int[] value = new int[21];

        for (int i = 0; i < value.length; i++) {
            if (i == 0) {
                value[0] = 1;
            } else {
                value[i] = value[i - 1] * 2;

            }
            System.out.println(i + " " + value[i]);
        }

    }


}
