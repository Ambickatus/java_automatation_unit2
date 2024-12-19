package ru.netology.service;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CashbackHackServiceTest {

    @Test
    public void shouldGive100RemainJupiterApi() {
        CashbackHackService neededSum = new CashbackHackService();
        int amount = 900;

        int actual = neededSum.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void shouldGive100RemainJInit4() {
        CashbackHackService neededSum = new CashbackHackService();
        int amount = 900;

        int actual = neededSum.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }


    @Test
    public void shouldGiveZeroRemainJupiterApi() {
        CashbackHackService neededSum = new CashbackHackService();
        int amount = 1000;

        int actual = neededSum.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldGiveZeroRemainJUnit4() {
        CashbackHackService neededSum = new CashbackHackService();
        int amount = 1000;

        int actual = neededSum.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGive800RemainJupiterApi() {
        CashbackHackService neededSum = new CashbackHackService();
        int amount = 1200;

        int actual = neededSum.remain(amount);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldGive800RemainJUnit4() {
        CashbackHackService neededSum = new CashbackHackService();
        int amount = 1200;

        int actual = neededSum.remain(amount);
        int expected = 800;

        assertEquals(expected, actual);
    }

}