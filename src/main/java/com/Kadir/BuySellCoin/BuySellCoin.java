package com.Kadir.BuySellCoin;

public class BuySellCoin {

    private final String name;
    private double totalSize;

    public static void main(String[] args) {

        // ingilizce create instance
        // türkce obje olustur
        // initialisieren
        BuySellCoin bscoin = new BuySellCoin("BTC");
        String buyResult = bscoin.buy(0);
        System.out.println("Buying " + buyResult);
        String sellResult = bscoin.sell(3);
        System.out.println("Selling " + sellResult);
        System.out.println(bscoin.getTotalSize());
    }


    public BuySellCoin(String name) {

        this.name = name;
    }

    // function / method
    // parameter
    /**
     * @param size
     */
    public String buy(double size) {

        System.out.println("Buying of " + size + name);
        totalSize = totalSize + size;
        return "succes";
    }

    public String sell(double size) {
        if (totalSize < size) {
            System.out.println("No Money!");
            return "Fail!";
        } else {
            System.out.println("Selling of " + size + name);
            totalSize = totalSize - size;
            return "succes";
        }
    }

    public double getTotalSize() {
        return totalSize;
    }


}
