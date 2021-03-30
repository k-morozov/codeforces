package com.codeforces.dynamic;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplTest {

    @Test
    public void getIndex_1() {
        int number = 1;
        int result = Impl.getNumber(number);
        int expected = 1;
        assertEquals(result, expected);
    }

    @Test
    public void getIndex_3() {
        int index = 3;
        int result = Impl.getNumber(index);
        int expected = 2;
        assertEquals(result, expected);
    }

    @Test
    public void getIndex_4() {
        int index = 4;
        int result = Impl.getNumber(index);
        int expected = 3;
        assertEquals(result, expected);
    }

    @Test
    public void getIndex_5() {
        int index = 5;
        int result = Impl.getNumber(index);
        int expected = 5;
        assertEquals(result, expected);
    }

    @Test
    public void getIndex_6() {
        int index = 6;
        int result = Impl.getNumber(index);
        int expected = 8;
        assertEquals(result, expected);
    }
}