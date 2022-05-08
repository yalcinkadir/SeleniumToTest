package com.kadir.accounts;

import static java.lang.System.out;

public class UseAccounts {

    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        myAccount.setName("Barry Burd");
        myAccount.setAddress("222 Cyberspace Lane");
        myAccount.setBalance(24.02);
        yourAccount.setName("Jane Q. Public");
        yourAccount.setAddress("111 Consumer Street");
        yourAccount.setBalance(55.63);

        myAccount.display();
        double myInterestRate = 5.00;
        double myInterestAmount = myAccount.getInterest(myInterestRate);
        out.print(" plus $");
        out.print(myInterestAmount);
        out.println(" interest ");

        yourAccount.display();
        double yourInterestRate = 7.00;
        out.print(" plus $");
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        out.print(yourInterestAmount);
        out.println(" interest ");

        yourAccount.display();
        out.println(" plus $" + yourAccount.getInterest(7.00) + " interest");
    }
}