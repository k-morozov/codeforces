package com.codeforces.sort;

import java.util.Scanner;

public class SortBuble {
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
        for (int i = 0; i < ar.length; ++i) {
            for( int j = ar.length - 1; j > i; --j) {
                if (ar[j - 1] > ar[j]) {
                    int temp = ar[j-1];
                    ar[j-1] = ar[j];
                    ar[j]=temp;
                }
            }
        }
    }

}