package com.codeforces.search;

import java.util.Scanner;

public class BinSearch {

    static boolean _binSearch(int[] values, int start, int finish, int element) {
        if (finish - start == 1) {
            return values[start] == element;
        }

        boolean resultFlag = false;
        int mid = start + (finish - start) / 2;
        if (values[mid] == element) {
            return true;
        }

        if(element > values[mid]) {
            resultFlag = _binSearch(values, mid, finish, element);
        } else {
            resultFlag = _binSearch(values, start, mid, element);
        }

        return resultFlag;
    }

    static boolean binSearch(int[] values, int element) {
        int start = 0;
        int finish = values.length;

        return _binSearch(values, start, finish, element);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeArrays = input.nextInt();
        int countElem = input.nextInt();

        int[] values = new int[sizeArrays];
        for(int i = 0; i < sizeArrays; ++i) {
            values[i] = input.nextInt();
        }

        int[] elems = new int[countElem];
        for(int i = 0; i < countElem; ++i) {
            elems[i] = input.nextInt();
        }

        for (int value : elems) {
            if (binSearch(values, value)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
