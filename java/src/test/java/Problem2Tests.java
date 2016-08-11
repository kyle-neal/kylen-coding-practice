package test.java;

import static org.junit.Assert.*;

import main.java.problems.Problem2;
import org.junit.*;

public class Problem2Tests {
    // Tests
    @Test
    public void test1() {
        int[] arr = {1, 2, 3};
        int[] expected = {3, 1, 2};
        int n = 1;
        assertArrayEquals(expected, Problem2.rotate(arr, n));
    }

    @Test
    public void test2() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5, 1, 2};
        int n = 3;
        assertArrayEquals(expected, Problem2.rotate(arr, n));
    }

    @Test
    public void test3() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int n = 5;
        assertArrayEquals(expected, Problem2.rotate(arr, n));
    }

    @Test
    public void test4() {
        int[] arr = {1, 2, 3};
        int[] expected = {2, 3, 1};
        int n = 5;
        assertArrayEquals(expected, Problem2.rotate(arr, n));
    }

    @Test
    public void test5() {
        int[] arr = {9, 4, 3, 9};
        int[] expected = {4, 3, 9, 9};
        int n = 3;
        assertArrayEquals(expected, Problem2.rotate(arr, n));
    }
}
