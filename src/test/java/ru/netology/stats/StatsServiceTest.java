package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSum() {
        StatsService manager = new StatsService ();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.sum (sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void shouldAverageSales() {
        StatsService manager = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.averageSales (sales);
        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void ShouldMaxSalesMonth() {
        StatsService manager = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.maxSales (sales);
        long expected = 8;

        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void ShouldMinSalesMonth() {
        StatsService manager = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.minSales (sales);
        long expected = 9;

        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void ShouldBelowTheAverage() {
        StatsService manager = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.countBelowAverageSales (sales);
        long expected = 5;

        Assertions.assertEquals (expected, actual);
    }

    @Test
    public void ShouldAboveTheAverage() {
        StatsService manager = new StatsService ();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = manager.countAboveAverageSales (sales);
        long expected = 5;

        Assertions.assertEquals (expected, actual);
    }

}

