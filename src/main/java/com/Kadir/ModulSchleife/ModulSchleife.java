package com.Kadir.ModulSchleife;

public class ModulSchleife {

    public static void main(String[] args) {

        for(int i = 1; i <= 100; i++){
            String fooBar = calculateFooBar(i);
            String bar = calculateBar(i);
            String foo = calculateFoo(i);
            if(fooBar != null){
                System.out.println(fooBar);
            } else if(bar!= null) {
                System.out.println(bar);
            } else if (foo != null){
                System.out.println(foo);
            } else {
                System.out.println(i);
            }
        }
    }

    public static String calculateFooBar(int value){
        if(value%3 == 0 && value%5==0) {
            return "foobar";
        } else {
            return null;
        }
    }

    public static String calculateFoo(int value){
        if(value%3 == 0) {
            return "foo";
        } else {
            return null;
        }
    }

    public static String calculateBar(int value){
        if(value%5==0) {
            return "bar";
        } else {
            return null;
        }
    }


}
