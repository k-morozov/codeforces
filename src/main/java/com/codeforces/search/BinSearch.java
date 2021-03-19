package com.codeforces.search;

import java.io.*;

public class BinSearch {

    static private StreamTokenizer in;
    static private PrintWriter out;

    static boolean _binSearchRec(int[] values, int start, int finish, int element) {
        if (finish - start == 1) {
            return values[start] == element;
        }

        boolean resultFlag = false;
        int mid = start + (finish - start) / 2;
        if (values[mid] == element) {
            return true;
        }

        if(element > values[mid]) {
            resultFlag = _binSearchRec(values, mid, finish, element);
        } else {
            resultFlag = _binSearchRec(values, start, mid, element);
        }

        return resultFlag;
    }

    static boolean _binSearchCircle(int[] values, int fromIndex, int toIndex, int element) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int mid =  low + (high - low) / 2;
            int midVal = values[mid];

            if (element > midVal) {
                low = mid + 1;
            } else if (element < midVal) {
                high = mid - 1;
            } else {
                return true;
            }
        }

        return false;
    }

    static boolean binSearch(int[] values, int element) {
        int start = 0;
        int finish = values.length;

        return _binSearchCircle(values, start, finish, element);
//        return _binSearchRec(values, start, finish, element);
    }

    static private int nextInt() throws IOException {
        in.nextToken();
        return (int)in.nval;
    }

    public static void main(String[] args)  {
        try {
            in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
            out = new PrintWriter(System.out);

            int sizeArrays = BinSearch.nextInt();
            int countElem = BinSearch.nextInt();

            int[] values = new int[sizeArrays];
            for (int i = 0; i < sizeArrays; ++i) {
                values[i] = BinSearch.nextInt();
            }

            int[] elems = new int[countElem];
            for (int i = 0; i < countElem; ++i) {
                elems[i] = BinSearch.nextInt();
            }

            for (int value : elems) {
                if (binSearch(values, value)) {
                    out.println("YES");
                } else {
                    out.println("NO");
                }
            }

            out.flush();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
