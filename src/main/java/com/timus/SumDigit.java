package com.timus;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SumDigit {
    static private StreamTokenizer in;
    static private PrintWriter out;

    static private int nextInt() {
        try {
            in.nextToken();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (int)in.nval;
    }


    public static void main(String[] args) {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);

        int count;
        count = SumDigit.nextInt();
        for (int i = 0; i < count; i++) {
            int valueSum = SumDigit.nextInt();
            int valueMulti = SumDigit.nextInt();

            Finder foo = new Finder(valueSum, valueMulti);
            String result = foo.findNumber();
            out.println(result);
            out.flush();
        }
    }
}

class Finder {
    private final int valueSumma;
    private final int valueMultiply;
    private int currentLength;
    private int[] number;

    private int currentSumma = 0;
    private int currentSumDbl = 0;

    private Map<Integer, Integer> hashmap;

    public Finder(int summa, int multiply) {
        this.valueSumma = summa;
        this.valueMultiply = multiply;
        this.currentLength = 0;
        this.number = new int[101];
        hashmap = new HashMap<>();
    }

    protected String findNumber() {
        if (valueMultiply < valueSumma
                || (valueMultiply!=0 && valueSumma ==0)
                || (valueMultiply==0 && valueSumma!=0)) {
            return "No solution";
        }

        for (int i = 0; i < 10; i++) {
            hashmap.put(i, i*i);
        }

        currentLength = valueSumma / 9 - 1;
        while ((currentSumDbl != valueMultiply || currentSumma != valueSumma) && currentLength < 100) {
            number = nextFind();
        }
        return toNumber();
    }

    private int[] nextFind() {
        boolean needMore = true;
        for (int i = 0; i <= currentLength; i++) {
            if(number[i] != 9) {
                if (currentSumDbl < valueMultiply && currentSumma < valueSumma) {
                    currentSumDbl = currentSumDbl - hashmap.get(number[i]);

                    ++number[i];
                    ++currentSumma;

                    currentSumDbl = currentSumDbl + hashmap.get(number[i]);

                    needMore = false;
                    break;
                }
            }
            currentSumma = currentSumma - number[i];
            currentSumDbl = currentSumDbl - hashmap.get(number[i]);
            number[i] = 0;
        }
        if (needMore) {
            ++currentLength;
        }
        return number;
    }


    private String toNumber() {
        if (currentLength >= 100) {
            return "No solution";
        }
        StringBuilder result = new StringBuilder();
        for (int i = currentLength; i >= 0 ; --i) {
            result.append(number[i]);
        }
        return result.toString();
    }
}