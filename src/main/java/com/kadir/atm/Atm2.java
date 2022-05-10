package com.kadir.atm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.in;

public class Atm2 {
    ArrayList<Integer> moneyList = new ArrayList<>(Arrays.asList(500, 200, 100, 50, 20, 10));

    public void withdrawMoney() {

        Scanner scannerWithdraw = new Scanner(in);
        System.out.println("Give your withdraw from your bank account: ");
        String withdrawString = scannerWithdraw.next();
        if (withdrawString.equals("exit")) {
            System.out.println("See you soon!");
            return;
        }

        int withdraw = 0;
        try {
            withdraw = Integer.parseInt(withdrawString);
            if (withdraw == 999) {
                return;
            }
        } catch (NumberFormatException numberFormatException) {
            System.out.println("This is a failure message. Program exit! ");
            return;
        }

        AtomicInteger rest = new AtomicInteger(withdraw);
        moneyList.forEach(money -> {                                    //money a name for "foreach" loop
            if (rest.get() >= money) {
                int countMoney = rest.get() / money;
                System.out.println(money + " * " + countMoney);
                rest.set(rest.get() - money * countMoney); //old: rest.set(rest.get() - money * countMoney);
            }
        });
        withdrawMoney();
    }

    public static void main(String[] args) {
        Atm2 atm = new Atm2();
        atm.withdrawMoney();
    }
}
