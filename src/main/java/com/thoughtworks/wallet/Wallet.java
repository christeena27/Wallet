package com.thoughtworks.wallet;

public class Wallet {
    private double currentBalance;


    public Wallet(double balance) {
        this.currentBalance = balance;

    }

    public void credit(double amount) {
        currentBalance += amount;

    }

    public double balance() {
        return currentBalance;
    }
}
