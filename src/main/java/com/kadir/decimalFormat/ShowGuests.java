package com.kadir.decimalFormat;

import com.kadir.accounts.Account;

import static java.lang.System.out;

public class ShowGuests {

    public static void main(String[] args) {

        Account[] accountArray = new Account[2];
        accountArray[0] = new Account("Gülsün", "Wien");
        accountArray[1] = new Account("Kadir", "Wien");

        for(Account account : accountArray){
            account.display();
        }
        out.println();

        String[] guestName = {"Kadir", "Gülsün", "Yusuf Kerem"};
        out.println("Name of Guests");
        for(int i=0; i<3; i++) {
            out.println(i + "\t" + guestName[i]);

        }
        out.println();

        int i = 0;
        for (String names : guestName ) {
            out.println(i + "\t" + names);
            i++;

        }
        out.println();

        int[] guests = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
        out.println("Room\tGuests");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            out.print(roomNum);
            out.print("\t");
            out.println(guests[roomNum]);
        }
        out.println();

        int roomNum = 0;
        for (int numGuests : guests) {
            out.print(roomNum++);
            out.print("\t");
            out.println(numGuests);
        }
    }
}
