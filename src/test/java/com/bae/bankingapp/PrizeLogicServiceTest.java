package com.bae.bankingapp;

import org.junit.Assert;
import org.junit.Test;

public class PrizeLogicServiceTest {
    PrizeLogicService prizeLogic = new PrizeLogicService();

    @Test
    public void testPrizeMoney() {

        int resultA = prizeLogic.genPrize("a123456");

        Assert.assertEquals(0, resultA);
    }

    @Test
    public void testPrizeMoneyB() {

        int resultB6 = prizeLogic.genPrize("b123456");
        Assert.assertEquals(50, resultB6);

        int resultB8 = prizeLogic.genPrize("b12345678");
        Assert.assertEquals(500, resultB8);

        int resultB10 = prizeLogic.genPrize("b1234567890");
        Assert.assertEquals(5000, resultB10);

    }

    @Test
    public void testPrizeMoneyC() {

        int resultC6 = prizeLogic.genPrize("c123456");
        Assert.assertEquals(100, resultC6);

        int resultC8 = prizeLogic.genPrize("c12345678");
        Assert.assertEquals(750, resultC8);

        int resultC10 = prizeLogic.genPrize("c1234567890");
        Assert.assertEquals(10000, resultC10);

    }

    @Test
    public void testMoneyWrongStartChar() {
        int result00 = 0;
        try {
            result00 = prizeLogic.genPrize("f123456");
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }

    @Test
    public void testMoneyWrongLength() {
        int result00 = 0;
        try {
            result00 = prizeLogic.genPrize("b1234567");
        } catch (Exception e) {
            return;
        }
        Assert.fail();
    }
}