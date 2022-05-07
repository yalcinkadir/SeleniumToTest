package com.kadir.atm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Atm {
    ArrayList<Integer> moneyList = new ArrayList<>(Arrays.asList(500, 200, 100, 50, 20, 10));

    public void withdrawMoney() {

        int count = 0;
        Scanner scannerWithdraw = new Scanner(System.in);
        while(count <3) {
            ++count;
            System.out.println("Give your withdraw from your bank account: ");
            int withdraw = Integer.parseInt(scannerWithdraw.nextLine());

            AtomicInteger rest = new AtomicInteger(withdraw);
            moneyList.forEach(money -> {
                if (rest.get() >= money) {
                    int countMoney = rest.get() / money;
                    System.out.println(money + " * " + countMoney);
                    rest.set(rest.get() - money * countMoney);
                }
            });
        }
    }

    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.withdrawMoney();

    }
}
