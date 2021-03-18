package com.codeforces.shop;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void checkExample1() {
        int[] array = {10, 13, 12, 8};
        int expected = Shop.checkStolenPc(array);
        assert expected == 2;
    }

    @Test
    public void checkExample2() {
        int[] array = {7, 5, 6, 4, 8};
        int expected = Shop.checkStolenPc(array);
        assert expected == 0;
    }

    @Test
    public void checkMyExample1() {
        int[] array = {};
        int expected = Shop.checkStolenPc(array);
        assert expected == 0;
    }

    @Test
    public void checkMyExample2() {
        int[] array = {3,8};
        int expected = Shop.checkStolenPc(array);
        assert expected == 4;
    }

    @Test
    public void checkMyExample3() {
        int[] array = {11,10, 14,15,16};
        int expected = Shop.checkStolenPc(array);
        assert expected == 2;
    }
}