package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeValueAmountException;

public class Wallet {
    private Money balance;


    public Wallet() throws NegativeValueAmountException {
        balance = new Money(0, Currency.RUPEE);

    }

    public void add(Money money) throws NegativeValueAmountException {
        this.balance = this.balance.add(money);

    }

    public Money balance() {
        return balance;
    }

    public void retrieve(Money money) throws NegativeValueAmountException{
        this.balance=balance.take(money);
    }


}