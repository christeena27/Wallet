package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeValueAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class WalletTest {
    @Test
    void shouldAddAmountWhenItIsAddedToTheWallet() throws NegativeValueAmountException {
        Money tenRupee = new Money(10, Currency.RUPEE);
        Money anotherTenMoney = new Money(10, Currency.RUPEE);
        Wallet wallet = new Wallet();

        wallet.add(tenRupee);

        assertEquals(wallet.balance(), anotherTenMoney);
    }

    @Test
    void shouldAddOneDollarAndOneRupeeToTheWallet() throws NegativeValueAmountException {
        Money oneRupee = Money.createRupee(1);
        Money oneDollar = Money.createDollar(1);
        Wallet wallet = new Wallet();

        Money seventySixRupees = new Money(76, Currency.RUPEE);

        wallet.add(oneRupee);
        wallet.add(oneDollar);

        assertEquals(wallet.balance(), seventySixRupees);

    }
}