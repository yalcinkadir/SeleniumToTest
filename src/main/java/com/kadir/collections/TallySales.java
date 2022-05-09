package com.kadir.collections;

import java.text.NumberFormat;
import java.util.ArrayList;

public class TallySales {

    public static void main(String[] args) {
        ArrayList<Sale> sales = new ArrayList<Sale>();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        fillTheList(sales);
        double total = 0;
        for (Sale sale : sales) {
            if (sale.getItem().equals("DVD")) {
                total += sale.getPrice();
            }
        }

        sales.stream().filter((n -> n.getItem().equals("DVD"))).forEach((n) -> System.out.println(n.getItem() + " " + n.getPrice()));
        System.out.println();

        double res = sales.stream().filter((n -> n.getItem().equals("DVD"))).map(n -> n.getPrice()).reduce(0.0, (price1, price2) -> price1 + price2);

        System.out.println(res);

        sales.stream().forEach((n) -> System.out.println(n.getItem() + " " + n.getPrice()));

        System.out.println(currency.format(total));
    }

    static void fillTheList(ArrayList<Sale> sales) {
        sales.add(new Sale("DVD", 15.00));
        sales.add(new Sale("Book", 12.00));
        sales.add(new Sale("DVD", 21.00));
        sales.add(new Sale("CD", 5.25));
    }
}
