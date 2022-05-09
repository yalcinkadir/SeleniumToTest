package com.kadir.human;

public class HumanAdult extends Human {

    public void shopping() {
        System.out.println("Im going to the Donau Zentrum shopping");
    }

    /**
     * measure for Mama 30ml per Measure
     *
     * @param measure count of measure
     */
    public int prepairMama(int measure) {
        int sumMama = measure * 30;
        System.out.println("My Mom is preparing Mama with " + sumMama + " ml");
        return sumMama;
    }
}
