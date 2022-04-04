package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeValueAmountException;


import java.util.Objects;

public class Money {
    private final double value;
    private final Currency currency;

    public Money(double amount, Currency currency) throws NegativeValueAmountException {
        if (amount < 0) throw new NegativeValueAmountException();
        this.value = amount;
        this.currency = currency;
    }

    public static Money createRupee(double amount) throws NegativeValueAmountException {
        return new Money(amount, Currency.RUPEE);
    }

    public static Money createDollar(double amount) throws NegativeValueAmountException {
        return new Money(amount, Currency.DOLLAR);
    }

    public Money add(Money another) throws NegativeValueAmountException {
        double anotherAmount = another.currency.convertToBase(another.value);

        return new Money(this.value + anotherAmount, this.currency);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return Double.compare(money.currency.convertToBase(money.value), this.currency.convertToBase(this.value)) == 0;

    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}