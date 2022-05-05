package com.kadir.human;

public class HumanMain {



    public static void main(String[] args) {
        HumanChild yusuf = new HumanChild();
        HumanAdult kadir = new HumanAdult();
        HumanAdult gülsün = new HumanAdult();

        kadir.food("steak");
        kadir.shopping();
        yusuf.food("mama");
        int result = gülsün.prepairMama(5);
        yusuf.drinkMama(result);


    }
}
