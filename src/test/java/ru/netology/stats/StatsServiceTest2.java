package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest2 {

    @Test
    public void calcAverageSumMonth () {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSumMonth(sales);
        long expected = 180 / 12;

        assertEquals(expected, actual);
    }

}