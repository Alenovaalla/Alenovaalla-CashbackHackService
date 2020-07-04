package ru.netology.service;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {


    @org.junit.Test
    public void shouldCalculateBonusIfMore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 10000;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;
        assertEquals (actual,expected);

    }

    @org.junit.Test
   public void shouldCalculateBonusIfLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;
        assertEquals (actual,expected);


    }

    @org.junit.Test
    public void shouldCalculateBonusIfEquals1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals (actual,expected);

    }

}
