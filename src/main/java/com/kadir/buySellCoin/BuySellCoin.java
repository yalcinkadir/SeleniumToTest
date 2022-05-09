package com.kadir.buySellCoin;

public class BuySellCoin {
    private final String name;
    private double totalSize;

    public static void main(String[] args) {

        BuySellCoin bscoin = new BuySellCoin("BTC");
        String buyResult = bscoin.buy(10);
        System.out.println("Buying " + buyResult);
        String sellResult = bscoin.sell(3);
        System.out.println("Selling " + sellResult);
        System.out.println(bscoin.getTotalSize());
    }

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

    public BuySellCoin(String name) {

        this.name = name;
    }

    public double getTotalSize() {
        return totalSize;
    }


}
