package com.codeforces.shop;

import java.util.Scanner;
import java.util.Arrays;

public class Shop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] ar = new int[count];
        for (int i = 0; i < count; ++i) {
            ar[i] = in.nextInt();
        }
        int countStolenPc = checkStolenPc(ar);
        System.out.println(countStolenPc);
    }

    public static int checkStolenPc(int[] ar) {
        Arrays.sort(ar);
        int countStolenPc = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            int currentValue = ar[i];
            while (currentValue + 1 != ar[i+1]) {
                ++countStolenPc;
                ++currentValue;
            }
        }
        return countStolenPc;
    }
}
