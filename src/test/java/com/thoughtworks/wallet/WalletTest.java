package com.thoughtworks.wallet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class WalletTest {
    @Test
    void shouldCreditAmountWhenItIsAddedToTheWallet() {
        Wallet wallet = new Wallet(10);

        wallet.credit(10);
        wallet.credit(5);

        assertTrue(wallet.isCredited(5));
    }
}
