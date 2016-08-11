package test.java;

import static org.junit.Assert.*;

import org.junit.*;
import main.java.problems.Problem1;

public class Problem1Tests {
    // Tests
    @Test
    public void test1() {
        int stock_prices_yesterday[] = {10, 7, 5, 8, 11, 9};
        assertEquals(6, Problem1.getMaxProfit(stock_prices_yesterday));
    }

    @Test
    public void test2() {
        int stock_prices_yesterday[] = {1, 50, 3, 4, 100};
        assertEquals(99, Problem1.getMaxProfit(stock_prices_yesterday));
    }

    @Test
    public void test3() {
        int stock_prices_yesterday[] = {100, 99, 98, 97};
        assertEquals(0, Problem1.getMaxProfit(stock_prices_yesterday));
    }

    @Test
    public void test4() {
        int stock_prices_yesterday[] = {1, 2, 3, 4, 5, 1, 20};
        assertEquals(19, Problem1.getMaxProfit(stock_prices_yesterday));
    }

    @Test
    public void test5() {
        int stock_prices_yesterday[] = {100, 75, 25, 0};
        assertEquals(0, Problem1.getMaxProfit(stock_prices_yesterday));
    }
}
