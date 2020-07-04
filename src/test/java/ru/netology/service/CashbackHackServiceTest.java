package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    void shouldCalculateBonusIfMore1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 10000;
        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    void shouldCalculateBonusIfLess1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual,expected);
    }

    @org.testng.annotations.Test
    void shouldCalculateBonusIfEquals1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

}
