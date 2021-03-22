package com.codeforces.search;

import java.io.*;

public class NearBinSearch {
    public static void main(String[] args) {
        Stream stream = new Stream();
        int sizeArray = stream.readInt();
        int sizeValues = stream.readInt();

        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = stream.readInt();
        }

        Finder foo = new Finder(array);
        int[] answers = new int[sizeValues];
        for (int i = 0; i < sizeValues; i++) {
            int value = stream.readInt();
            answers[i] = foo.getNear(value);
        }

        for (int i = 0; i < sizeValues; i++) {
            stream.getOut().println(answers[i]);
        }

        stream.getOut().flush();
    }
}

class Finder {
    private final int[] array;

    public Finder(int[] array) {
        this.array = array;
    }

    public int getNear(int value) {
        return _getNear(0, array.length , value);
    }

    private int _getNear(int left, int right, int value) {
        if (right - left == 1) {
            int arrayValue = array[left];
            if (arrayValue == value) {
                return arrayValue;
            }

            return _checkSides(left, value);
        }

        int midIndex = left + (right - left) / 2;
        int midValue = array[midIndex];
        if (midValue == value) {
            return midValue;
        } else {
            if (value < midValue) {
                return _getNear(left, midIndex, value);
            } else {
                return _getNear(midIndex , right, value);
            }
        }
    }

    // *****************************************************************

    private int _checkSides(int pos, int value) {
        if (pos == 0) {
            return checkBegin(pos, value);
        } else {
            if (pos == array.length - 1) {
                return checkEnd(pos, value);
            } else {
                if (value < array[pos]) {
                    return checkLeft(pos, value);
                } else {
                    return checkRight(pos, value);
                }
            }
        }
    }

    private int checkBegin(int pos, int value) {
        int valueLeft = array[pos];
        if (pos + 1 == array.length) {
            return valueLeft;
        }

        int valueRight = array[pos + 1];
        return value - valueLeft <= valueRight - value ? valueLeft : valueRight;
    }

    private int checkEnd(int pos, int value) {
        int valueRight = array[pos];
        if (pos - 1 < 0) {
            return valueRight;
        }

        int valueLeft = array[pos - 1];
        return value - valueLeft <= valueRight - value ? valueLeft : valueRight;
    }

    private int checkLeft(int pos, int value) {
        int right = array[pos];
        int left = array[pos - 1];
        return value - left <= right - value ? left : right;
    }

    private int checkRight(int pos, int value) {
        int left = array[pos];
        int right = array[pos + 1];
        return value - left <= right - value ? left : right;
    }

}

class Stream {
    private final StreamTokenizer in;
    private final PrintWriter out;

    public Stream() {
        in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        out = new PrintWriter(System.out);
    }

    public int readInt() {
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