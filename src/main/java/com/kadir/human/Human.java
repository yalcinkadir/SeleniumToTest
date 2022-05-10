package com.kadir.human;

public abstract class Human {

    int footCount = 2;
    int handCount = 2;

    public void food(String foodName) {

        System.out.println("Im busy now, Im eating " + foodName);
    }

    public abstract void shower();

}
