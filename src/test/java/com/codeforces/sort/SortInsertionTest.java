package com.codeforces.sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortInsertionTest {
    @Test
    public void sortExample() {
        int[] ar = {5, 4, 3, 2, 1};
        SortInsertion.sort(ar);
        int[] expected = {1,2,3,4,5};
        assertArrayEquals(ar, expected);
    }

    @Test
    public void sortEmpty() {
        int[] ar = {};
        SortInsertion.sort(ar);
        int[] expected = {};
        assertArrayEquals(ar, expected);
    }

    @Test
    public void sortOneElem() {
        int[] ar = {13};
        SortInsertion.sort(ar);
        int[] expected = {13};
        assertArrayEquals(ar, expected);
    }

    @Test
    public void sortSorted() {
        int[] ar = {1,2,3,4,5};
        SortInsertion.sort(ar);
        int[] expected = {1,2,3,4,5};
        assertArrayEquals(ar, expected);
    }

    @Test
    public void sortWithSomeDublicate() {
        int[] ar = {5, 4, 3, 2, 1, 5, 4, 3, 2, 1};
        SortInsertion.sort(ar);
        int[] expected = {1,1,2,2,3,3,4,4,5,5};
        assertArrayEquals(ar, expected);
    }

    @Test
    public void sortWithOneDublicate() {
        int[] ar = {5, 4, 3, 2, 1, 5, 1, 1};
        SortInsertion.sort(ar);
        int[] expected = {1,1,1,2,3,4,5,5};
        assertArrayEquals(ar, expected);
    }

    @Test
    public void sortMinus() {
        int[] ar = {5, 4, 3, 2, 1, -5, -1, -1};
        SortInsertion.sort(ar);
        int[] expected = {-5,-1,-1,1,2,3,4,5};
        assertArrayEquals(ar, expected);
    }
}