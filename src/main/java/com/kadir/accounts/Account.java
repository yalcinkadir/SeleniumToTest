package com.kadir.accounts;


import static java.lang.System.out;

public class Account {

    private String name;
    private String address;
    private double balance;

    public Account(String name, String address){ //new construction
        this.name = name;
        this.address  = address;
    }

    Account(){ //new construction
    }

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

    public void display() {
        out.print(name);
        out.print(" (");
        out.print(address);
        out.print(") has $");
        out.print(balance);
        out.println();
    }

    public double getInterest(double percentageRate) {
        return balance * percentageRate / 100.00;
    }
}