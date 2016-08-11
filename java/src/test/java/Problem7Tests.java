package test.java;

import static org.junit.Assert.*;

import main.java.problems.Problem7;
import org.junit.*;

public class Problem7Tests {
    // Tests
    @Test
    public void test1() {
        int f = 6;
        assertEquals(720, Problem7.factIterative(f));
    }

    @Test
    public void test2() {
        int f = 6;
        assertEquals(720, Problem7.factRecursive(f));
    }

    @Test
    public void test3() {
        int f = 8;
        assertEquals(40320, Problem7.factIterative(f));
    }

    @Test
    public void test4() {
        int f = 8;
        assertEquals(40320, Problem7.factRecursive(f));
    }
}
