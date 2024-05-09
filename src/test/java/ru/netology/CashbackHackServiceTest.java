package ru.netology;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void acceptableLimit() {

        int expected = 999;
        int actual = service.remain(1001);

        assertEquals(actual, expected);

    }

    @Test
    public void remainUnderLimit() {

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);

    }

    @Test
    public void remainOnLimit() {

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(actual, expected);

    }
}