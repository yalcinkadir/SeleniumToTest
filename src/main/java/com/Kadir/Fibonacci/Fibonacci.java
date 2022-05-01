package com.Kadir.Fibonacci;

public class Fibonacci {
    public static void main(String[] args) {
        int[] testValues = {7};
        for (int i = 0; i < testValues.length; ++i) {
            System.out.println(calculateProcess(testValues[i]));
        }
    }

    public static int calculateProcess(int a) {
        int b;
        if (a <= 1) {
            if (a == 1) {
                b = a;
            } else {
                b = 0;
            }
        } else {
            b = calculateProcess(a - 1) + calculateProcess(a - 2);

        }
        return b;
    }

}
