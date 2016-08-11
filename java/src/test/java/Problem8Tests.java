package test.java;

import static org.junit.Assert.*;

import main.java.problems.Problem8;
import org.junit.*;

public class Problem8Tests {
    // Test
    @Test
    public void test1() {
        int flightTime = 60;
        int[] movies = {20, 10, 50, 40};
        assertEquals(true, Problem8.hasEvenMovieTimesv1(flightTime, movies));
    }

    @Test
    public void test2() {
        int flightTime = 60;
        int[] movies = {20, 10, 50, 40};
        assertEquals(true, Problem8.hasEvenMovieTimesv2(flightTime, movies));
    }

    @Test
    public void test3() {
        int flightTime = 55;
        int[] movies = {20, 10, 50, 40};
        assertEquals(false, Problem8.hasEvenMovieTimesv1(flightTime, movies));
    }

    @Test
    public void test4() {
        int flightTime = 55;
        int[] movies = {20, 10, 50, 40};
        assertEquals(false, Problem8.hasEvenMovieTimesv2(flightTime, movies));
    }
}
