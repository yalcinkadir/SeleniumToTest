package com.kadir.accounts;

import static java.lang.System.out;

public class UseAccounts2 {

    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.setName("Barry Burd");
        myAccount.setAddress("222 Cyberspace Lane");
        myAccount.setBalance(24.02);
        yourAccount.setName("Jane Q. Public");
        yourAccount.setAddress("111 Consumer Street");
        yourAccount.setBalance(55.63);

        out.print(myAccount.getName());
        out.print(" (");
        out.print(myAccount.getAddress());
        out.print(") has $");
        out.print(myAccount.getBalance());

        out.print(yourAccount.getName());
        out.print(" (");
        out.print(yourAccount.getAddress());
        out.print(") has $");
        out.print(yourAccount.getBalance());
    }
}
