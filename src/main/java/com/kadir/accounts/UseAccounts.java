package com.kadir.accounts;

import static java.lang.System.out;

public class UseAccounts {

    public static void main(String[] args) {
        Account myAccount = new Account();
        Account yourAccount = new Account();

        Account accountKadir = new Account("Kadir", "vienna", 150.0);
        Account accountGulsun = new Account("Gülsün", "vienna", 250.0);
        out.println(accountKadir.getName() + "\t" + accountKadir.getAddress() + "\t$" + accountKadir.getBalance());
        out.println(accountGulsun.getName() + "\t" + accountGulsun.getAddress() + "\t$" + accountGulsun.getBalance());

        myAccount.setName("Barry Burd");
        myAccount.setAddress("222 Cyberspace Lane");
        myAccount.setBalance(24.02);

        myAccount.display();

        double myInterestRate = 5.00;
        double myInterestAmount = myAccount.getInterest(myInterestRate); //giving myInterestRate to getInterest in Account class
        out.print(" plus $");
        out.print(myInterestAmount);
        out.println(" interest ");

        yourAccount.setName("Jane Q. Public");
        yourAccount.setAddress("111 Consumer Street");
        yourAccount.setBalance(55.63);

        yourAccount.display();

        double yourInterestRate = 7.00;
        double yourInterestAmount = yourAccount.getInterest(yourInterestRate);
        out.print(" plus $");
        out.print(yourInterestAmount);
        out.println(" interest ");

        //displaying also in this way
        yourAccount.display();
        out.println(" plus $" + yourAccount.getInterest(7.00) + " interest");
    }
}