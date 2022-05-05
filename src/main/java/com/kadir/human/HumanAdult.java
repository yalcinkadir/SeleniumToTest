package com.kadir.human;

public class HumanAdult extends Human {

    public void shopping() {
        System.out.println("Im going to the Donau Zentrum shopping");
    }

    public int prepairMama(int measure) {
        int sumMama = measure * 30;
        System.out.println("My Mom is preparing Mama with " + sumMama + " ml");
        return sumMama;
    }

}
