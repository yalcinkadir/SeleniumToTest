package com.kadir.elevator;

public class Elevator {

    public int calculate(int maxInElevator, int humanKg) {
        int maxKg = maxInElevator;
        int hKg = humanKg;
        maxKg = maxKg / hKg;

        return maxKg;
    }
}
