package com.brianFraser;

public class Cup {

    private String liquidType;
    private double percentFull;

    public Cup() {
    }
    public Cup(String liquidType, double percentFull){
        this.liquidType = liquidType;
        this.percentFull = percentFull;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public void setLiquidType(String liquidType) {
        this.liquidType = liquidType;
    }

    public double getPercentFull() {
        return percentFull;
    }

    public void setPercentFull(double percentFull) {
        this.percentFull = percentFull;
    }

    public void write() {
        System.out.println("Verdiginiz lig " + liquidType + ", ve percent "+ percentFull + " tesekkürler");
    }
}
