package com.thoughtworks.wallet;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class WalletTest {
    @Test
    void shouldCreditAmountWhenItIsAddedToTheWallet() {
        Wallet wallet = new Wallet(10.0);

        wallet.credit(10.0);
        wallet.credit(5.0);

        double balance = wallet.balance();
        assertThat(balance, is(equalTo(25.0)));
    }
}
