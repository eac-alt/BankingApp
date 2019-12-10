package com.bae.bankingapp;

import org.junit.Assert;
import org.junit.Test;

public class PrizeLogicTest {
    PrizeLogic prizeLogic = new PrizeLogic();

    @Test
    public void testPrizeMoney() {

        int resultA = prizeLogic.genNumber("a123456");

        Assert.assertEquals(0, resultA);
    }

    @Test
    public void testPrizeMoneyB() {

        int resultB6 = prizeLogic.genNumber("b123456");
        Assert.assertEquals(50, resultB6);

        int resultB8 = prizeLogic.genNumber("b12345678");
        Assert.assertEquals(500, resultB8);

        int resultB10 = prizeLogic.genNumber("b1234567890");
        Assert.assertEquals(5000, resultB10);

    }

    @Test
    public void testPrizeMoneyC() {

        int resultC6 = prizeLogic.genNumber("c123456");
        Assert.assertEquals(100, resultC6);

        int resultC8 = prizeLogic.genNumber("c12345678");
        Assert.assertEquals(750, resultC8);

        int resultC10 = prizeLogic.genNumber("c1234567890");
        Assert.assertEquals(10000, resultC10);

    }

    @Test
    public void testMoneyWrongStartChar() {
        int result00 = 0;
        try {
            result00 = prizeLogic.genNumber("f123456");
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }

    @Test
    public void testMoneyWrongLength() {
        int result00 = 0;
        try {
            result00 = prizeLogic.genNumber("b1234567");
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
}