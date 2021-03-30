package com.codeforces.dynamic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StreamTokenizer;

public class FibNumbers {
    public static void main(String[] args) {
        Stream stream = new Stream();
        int index = stream.nextInt();
        int result = Impl.getNumber(index);
        stream.getOut().println(result);
        stream.getOut().flush();
    }
}

class Impl {
    static public int getNumber(int index) {
        int first = 1;
        int second = 1;

        if (index > 2) {
            int pos = 3;
            while(pos <= index) {
                int temp = second + first;
                first = second;
                second = temp;
                ++pos;
            }
        }

        return second;
    }
}

class Stream {
    private final StreamTokenizer in;
    private final PrintWriter out;

    public Stream() {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
    }

    public int nextInt() {
        try {
            in.nextToken();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return (int)in.nval;
    }

    public PrintWriter getOut() {
        return out;
    }
}