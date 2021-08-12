package ru.netology.sales;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStatsServiceTest {
    @Test
    public void shouldGetMinSales() {
        StatsService serviceTest = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = serviceTest.minSales(sales);
        int expected = 9;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetMaxSales() {
        StatsService serviceTest = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = serviceTest.maxSales(sales);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSumSales() {
        StatsService serviceTest = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = serviceTest.sumSales(sales);
        int expected = 180;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetAverageSales() {
        StatsService serviceTest = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = serviceTest.averageSales(sales);
        int expected = 15;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNumberMonthLessAverageSales() {
        StatsService serviceTest = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = serviceTest.NumberMonthLessAverageSales(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetNumberMonthOverAverageSales() {
        StatsService serviceTest = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = serviceTest.NumberMonthOverAverageSales(sales);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
