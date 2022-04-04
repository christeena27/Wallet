package com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeValueAmountException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {
    @Test
    void shouldReturnTrueWhenOneDollarIsEqualToSeventyFiveRupees() throws NegativeValueAmountException {
        Money seventyFiveRupee = Money.createRupee(75);
        Money oneDollar = Money.createDollar(1);

        assertEquals(oneDollar, seventyFiveRupee);

    }


}
