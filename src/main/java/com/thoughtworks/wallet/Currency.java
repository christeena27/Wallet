package com.thoughtworks.wallet;

public enum Currency {
    RUPEE(1), DOLLAR(75);

    private final double conversionFactor;

    Currency(double conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public double convertToBase(double value) {
        return value * conversionFactor;
    }

}