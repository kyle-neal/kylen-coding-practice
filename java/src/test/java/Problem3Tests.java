package test.java;

import static org.junit.Assert.*;

import main.java.problems.Problem3;
import org.junit.*;

public class Problem3Tests {
    // Tests
    @Test
    public void test1() {
        String s = "()[]{}";
        assertEquals(true, Problem3.isBalanced(s));
    }

    @Test
    public void test2() {
        String s = "([{}])";
        assertEquals(true, Problem3.isBalanced(s));
    }

    @Test
    public void test3() {
        String s = "([]{})";
        assertEquals(true, Problem3.isBalanced(s));
    }

    @Test
    public void test4() {
        String s = "([)]";
        assertEquals(false, Problem3.isBalanced(s));
    }

    @Test
    public void test5() {
        String s = "([]";
        assertEquals(false, Problem3.isBalanced(s));
    }

    @Test
    public void test6() {
        String s = "[])";
        assertEquals(false, Problem3.isBalanced(s));
    }

    @Test
    public void test7() {
        String s = "([})";
        assertEquals(false, Problem3.isBalanced(s));
    }
}
