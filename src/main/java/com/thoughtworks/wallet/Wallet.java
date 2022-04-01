package com.thoughtworks.wallet;

public class Wallet {
    private int previousBalance;
    private int currentBalance;


    public Wallet(int balance) {
        this.currentBalance = balance;
        this.previousBalance = 0;

    }

    public void credit(int amount) {
        previousBalance = currentBalance;
        currentBalance += amount;

    }

    public boolean isCredited(int creditedAmount) {
        return currentBalance - previousBalance == creditedAmount;

    }
}
