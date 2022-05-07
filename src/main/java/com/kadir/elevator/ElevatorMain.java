package com.kadir.elevator;

public class ElevatorMain {

    public static void main(String[] args) {

        Elevator elevator = new Elevator();
        System.out.println(elevator.calculate(1400, 150));

        int result = elevator.calculate(1400, 150);
        System.out.println("Result = " + result);
    }
}
