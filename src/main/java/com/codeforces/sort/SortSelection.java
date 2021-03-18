package com.codeforces.sort;

import java.util.Scanner;

public class SortSelection {
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
            int minIdx = i;
            for(int j = i + 1; j < ar.length; ++j) {
                if (ar[minIdx] > ar[j]) {
                    minIdx = j;
                }
            }

            if (minIdx != i) {
                int temp = ar[minIdx];
                ar[minIdx] = ar[i];
                ar[i] = temp;
            }
        }
    }
}
