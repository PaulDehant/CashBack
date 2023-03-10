package ru.netology.DZ1AutoTest;


import org.junit.jupiter.api.Test;
import ru.netology.BonusService;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BonusServiceTest {


    @Test
    public void calculateBonus() {
        BonusService service = new BonusService();
        int amount = 200;
        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void calculateBonusEquals() {
        BonusService service = new BonusService();
        int amount = 1000;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void calculateBonusMore() {
        BonusService service = new BonusService();
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }

    @Test
    public void calculateBonusVeryMore() {
        BonusService service = new BonusService();
        int amount = 10000;
        int expected = 1000;
        int actual = service.remain(amount);
        assertEquals(actual, expected);

    }
}