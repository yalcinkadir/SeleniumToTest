package com.kadir.employee;

public class PartTimeEmployee extends Employee {

    private double hourlyRate;

    public double findPaymentAmount(int hours) {
        return hourlyRate * hours;
    }


    public void setHourlyRate(double rateIn) {
        hourlyRate = rateIn;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}
