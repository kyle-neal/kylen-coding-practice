package test.java;

import static org.junit.Assert.*;

import main.java.problems.Problem6;
import org.junit.*;

public class Problem6Tests {
    // Tests
    @Test
    public void test1() {
        int[] coins = {1, 2, 3};
        int amt = 4;
        assertEquals(4, Problem6.countOptimal(coins, amt));
    }

    @Test
    public void test2() {
        int[] coins = {1, 2, 3, 5, 6, 7};
        int amt = 5;
        assertEquals(6, Problem6.countOptimal(coins, amt));
    }
}

