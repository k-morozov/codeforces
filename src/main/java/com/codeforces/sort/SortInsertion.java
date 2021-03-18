package com.codeforces.sort;

import java.util.Scanner;

public class SortInsertion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] ar = new int[count];
        for(int i = 0; i < count; ++i) {
            ar[i] = in.nextInt();
        }

        sort(ar);

        for (int val : ar
        ) {
            System.out.print(val + " ");
        }
    }

    public static void sort(int[] ar) {
        for (int i = 1; i < ar.length; ++i) {
            int key = ar[i];
            int j = i - 1;
            while (j>=0 && ar[j] > key) {
                ar[j + 1] = ar[j];
                --j;
            }
            ar[j + 1] = key;
        }
    }
}
