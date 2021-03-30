package com.codeforces.dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CheckerTest {

    @Test
    public void find3() {
        int number = 3;
        int result = Checker.find(number);
        int expected = 7;
        assertEquals(expected, result);
    }

}