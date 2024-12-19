package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldGive100Remain() {
        CashbackHackService neededSum = new CashbackHackService();
        int amount = 900;

        int actual = neededSum.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);

    }

    @Test
    public void shouldGiveZeroRemain() {
        CashbackHackService neededSum = new CashbackHackService();
        int amount = 1000;

        int actual = neededSum.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    public void shouldGive800Remain() {
        CashbackHackService neededSum = new CashbackHackService();
        int amount = 1200;

        int actual = neededSum.remain(amount);
        int expected = 800;

        assertEquals(expected, actual);
    }

}