package com.codeforces.sort;

import java.util.Scanner;

public class SortMerged {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] ar = new int[count];
        for(int i = 0; i < count; ++i) {
            ar[i] = in.nextInt();
        }

        sort(ar, 1);

        for (int val : ar
        ) {
            System.out.print(val + " ");
        }
    }

    public static void sort(int[] ar, int shift) {
        int len = ar.length;
        if (len == 1) {
            return;
        }



    }
}