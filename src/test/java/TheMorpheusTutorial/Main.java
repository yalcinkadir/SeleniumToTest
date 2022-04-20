package TheMorpheusTutorial;

import org.checkerframework.checker.units.qual.C;

public class Main {
    public static void main(String[] args) {
        CustomThread t1 = new CustomThread("erster Fred");
        CustomThread t2 = new CustomThread("zweiter Fred");

        t1.start();
        t2.start();

    }
}
