package com.Kadir;

public class Schaltjahr {

    public static void main(String[] args) {
        int year = 2022;
        Schaltjahr schaltjahr = new Schaltjahr();
        System.out.println(schaltjahr.leapyear(year));

    }

    public String leapyear(int year) {
        if (year % 4 != 0) {
            return year + " is not leap year";
        } else if (year % 100 != 0) {
            return year + " is leap year, divisible 4 and not 100";
        } else if (year % 100 == 0 && year % 400 == 0) {
            return year + " is a leap year divisible 4, 100 and 400";
        }
        return "no leap year";
    }
}
