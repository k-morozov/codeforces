package com.codeforces.dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class withoutOne {
    public static void main(String[] args) {
        Stream stream = new Stream();
        int count = stream.nextInt();
        int result = Checker.find(count);
        stream.getOut().println(result);
        stream.getOut().flush();
    }
}

class Checker {
    /**
     * t0 = 0
     * t1 = 0
     * t2 = 1
     * t3 = 1
     * t4 = 2
     * t5 = 4
     * t6 = 7
     *
     * n1 = 2
     * n2 = 4
     * n3 = 7
     */

    static public int find(int n) {
        int left = 0;
        int mid = 0;
        int right = 1;

        int pos = 3;
        final int shift = 3;
        int count = 0;
        while (pos <= n + shift) {
            count = left + mid + right;
            left = mid;
            mid = right;
            right = count;
            ++pos;
        }

        return count;
    }
}

//class Stream {
//    private final StreamTokenizer in;
//    private final PrintWriter out;
//
//    public Stream() {
//        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
//        out = new PrintWriter(System.out);
//    }
//
//    public int nextInt() {
//        try {
//            in.nextToken();
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return (int)in.nval;
//    }
//
//    public PrintWriter getOut() {
//        return out;
//    }
//}
