package com.kadir.human;

public class HumanChild extends Human {

    @Override
    public void food(String foodName) {

        System.out.println("My mom and me are busy now. Im eating " + foodName);
    }

    @Override
    public void shower() {
        System.out.println("Baby needs parents");
    }

    public void drinkMama(int ml) {
        System.out.println("Im very hungry, I will drink Mama " + ml + " ml");
    }
}
