package com.Kadir.Immobilien;

public class ImmoHaus extends Immo {

    public void calculatePrice() {
        System.out.println("Your choices for house " + getRoomNumber() + " lexus? " + isLexus());

        int calculatedPrice = 300 + getRoomNumber() * 20;
        if(isLexus()){
            calculatedPrice = calculatedPrice + 100;
        }
        System.out.println("Your Flat Price is " + calculatedPrice);
    }
}
