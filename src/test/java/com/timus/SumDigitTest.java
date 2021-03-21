package com.timus;

import org.junit.Assert;
import org.junit.Test;

public class SumDigitTest {
    @Test
    public void exampleOneFromTask() {
        int valueSum = 9;
        int valueMulti = 81;
        Finder foo = new Finder(valueSum, valueMulti);
        String actual = foo.findNumber();
        String expected = "9";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void exampleTwoFromTask() {
        int valueSum = 12;
        int valueMulti = 9;
        Finder foo = new Finder(valueSum, valueMulti);
        String actual = foo.findNumber();
        String expected = "No solution";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void exampleThreeFromTask() {
        int valueSum = 6;
        int valueMulti = 10;
        Finder foo = new Finder(valueSum, valueMulti);
        String actual = foo.findNumber();
        String expected = "1122";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void exampleFourFromTask() {
        int valueSum = 7;
        int valueMulti = 9;
        Finder foo = new Finder(valueSum, valueMulti);
        String actual = foo.findNumber();
        String expected = "111112";

        Assert.assertEquals(actual, expected);
    }

}