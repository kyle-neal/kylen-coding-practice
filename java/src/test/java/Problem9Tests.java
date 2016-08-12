package test.java;

import static org.junit.Assert.*;

import main.java.problems.Problem9;
import org.junit.*;

public class Problem9Tests {
    // Tests
    @Test public void test1(){
        String ransom = "a";
        String magazine = "b";
        assertEquals(false, Problem9.canConstruct(ransom, magazine));
    }

    @Test public void test2(){
        String ransom = "aa";
        String magazine = "ab";
        assertEquals(false, Problem9.canConstruct(ransom, magazine));
    }

    @Test public void test3(){
        String ransom = "aa";
        String magazine = "aab";
        assertEquals(true, Problem9.canConstruct(ransom, magazine));
    }

    @Test public void test4(){
        String ransom = "zyx";
        String magazine = "aaasdfasdfaasdfzlkasdflksadjyalsdfkjsdlkjxb";
        assertEquals(true, Problem9.canConstruct(ransom, magazine));
    }

    @Test public void test5(){
        String ransom = "a";
        String magazine = "a";
        assertEquals(true, Problem9.canConstruct(ransom, magazine));
    }
}
