package com.codeforces.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FinderTest {

    @Test
    public void findRealFirstValue() {
        int[] array = {1,2,3,4,5,6,7};
        int value = 3;

        Finder foo = new Finder(array);
        int actual = foo.getNear(value);

        int expected = 3;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findRealSecondValue() {
        int[] array = {1,2,3,4,5,6,7};
        int value = 2;

        Finder foo = new Finder(array);
        int actual = foo.getNear(value);

        int expected = 2;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findRealPreLastValue() {
        int[] array = {1,2,3,4,5,6,7};
        int value = 6;

        Finder foo = new Finder(array);
        int actual = foo.getNear(value);

        int expected = 6;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findRealLastValue() {
        int[] array = {1,2,3,4,5,6,7};
        int value = 7;

        Finder foo = new Finder(array);
        int actual = foo.getNear(value);

        int expected = 7;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNearFirstValue1() {
        int[] array = {1,3,4,5,6,7};
        int value = 2;

        Finder foo = new Finder(array);
        int actual = foo.getNear(value);

        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNearFirstValue2() {
        int[] array = {1,4,4,5,6,7};
        int value = 2;

        Finder foo = new Finder(array);
        int actual = foo.getNear(value);

        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNearFirstValueLeft() {
        int[] array = {0,3,4,5,6,7};
        int value = -1;

        Finder foo = new Finder(array);
        int expected = foo.getNear(value);

        int actual = 0;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNearLastValueLeft1() {
        int[] array = {1,2,3,4,5,6,7};
        int value = 8;

        Finder foo = new Finder(array);
        int expected = foo.getNear(value);

        int actual = 7;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNearLastValueLeft2() {
        int[] array = {1,2,3,4,5,6,7};
        int value = 9;

        Finder foo = new Finder(array);
        int expected = foo.getNear(value);

        int actual = 7;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNearMid1() {
        int[] array = {1,2,4,4,5,6,7};
        int value = 3;

        Finder foo = new Finder(array);
        int expected = foo.getNear(value);

        int actual = 2;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNearMid2() {
        int[] array = {1,2,4,4,5,6,8};
        int value = 7;

        Finder foo = new Finder(array);
        int expected = foo.getNear(value);

        int actual = 6;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNearMid3() {
        int[] array = {1,2,3,5,6,8};
        int value = 4;

        Finder foo = new Finder(array);
        int expected = foo.getNear(value);

        int actual = 3;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNearMid4() {
        int[] array = {1,3,5,7,9};
        int value = 4;

        Finder foo = new Finder(array);
        int expected = foo.getNear(value);

        int actual = 3;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void findNearMid5() {
        int[] array = {1,3,5,7,9};
        int value = 8;

        Finder foo = new Finder(array);
        int expected = foo.getNear(value);

        int actual = 7;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void findNearMid6() {
        int[] array = {1,3,5,7,9};
        int value = 6;

        Finder foo = new Finder(array);
        int expected = foo.getNear(value);

        int actual = 5;

        Assert.assertEquals(actual, expected);
    }

}