package com.codeforces.search;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class BinSearchTest {

    @Test
    public void binSearchMid() {
        int[] in = {1,2,3,4,5};
        int element = 3;
        final boolean expected = true;
        assertEquals(BinSearch.binSearch(in, element), expected);
    }

    @Test
    public void binSearchStart() {
        int[] in = {1,2,3,4,5};
        int element = 1;
        final boolean expected = true;
        assertEquals(BinSearch.binSearch(in, element), expected);
    }

    @Test
    public void binSearchAfterStart() {
        int[] in = {1,2,3,4,5};
        int element = 2;
        final boolean expected = true;
        assertEquals(BinSearch.binSearch(in, element), expected);
    }

    @Test
    public void binSearchFinish() {
        int[] in = {1,2,3,4,5};
        int element = 5;
        final boolean expected = true;
        assertEquals(BinSearch.binSearch(in, element), expected);
    }

    @Test
    public void binSearchPreFinish() {
        int[] in = {1,2,3,4,5};
        int element = 4;
        final boolean expected = true;
        assertEquals(BinSearch.binSearch(in, element), expected);
    }

    @Test
    public void binSearchOneElem() {
        int[] in = {1};
        int element = 1;
        final boolean expected = true;
        assertEquals(BinSearch.binSearch(in, element), expected);
    }

    @Test
    public void binSearchOneElemNoFound() {
        int[] in = {1};
        int element = 2;
        final boolean expected = false;
        assertEquals(BinSearch.binSearch(in, element), expected);
    }

    @Test
    public void binSearchNoFoundLess() {
        int[] in = {1,2,3,4,5};
        int element = 0;
        final boolean expected = false;
        assertEquals(BinSearch.binSearch(in, element), expected);
    }

    @Test
    public void binSearchNoFoundMore() {
        int[] in = {1,2,3,4,5};
        int element = 6;
        final boolean expected = false;
        assertEquals(BinSearch.binSearch(in, element), expected);
    }

    @Test
    public void binSearchExampleFromTask() {
        PrintStream out = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(buffer);
        System.setOut(printStream);


        InputStream in = System.in;
        String dataInput = "10 5\n" +
                "1 2 3 4 5 6 7 8 9 10\n" +
                "-2 0 4 9 12";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(dataInput.getBytes());
        System.setIn(inputStream);


        String expected = "NO\n" +
                "NO\n" +
                "YES\n" +
                "YES\n" +
                "NO\n";

        BinSearch.main(null);
        assertEquals(expected, buffer.toString());

        System.setOut(out);
        System.setIn(in);
    }
}