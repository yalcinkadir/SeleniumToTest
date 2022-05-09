package com.kadir.accounts;


import static java.lang.System.out;

public class Account {

    private String name;
    private String address;
    private double balance;

    public void display() {
        out.print(name);
        out.print(" (");
        out.print(address);
        out.print(") has $");
        out.print(balance);
    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }

    //new construction with 3 parameters
    public Account(String name, String address, double balance) {
        this.name = name;
        this.address = address;
        this.balance = balance;
    }

    //new construction with 2 parameters
    public Account(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //new construction default parameter
    Account() {
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}