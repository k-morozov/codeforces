package com.codeforces.queue;

import java.util.ArrayList;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Impl _impl = new Impl();

        Scanner in = new Scanner(System.in);
        while (true) {
            String com = in.nextLine();
            String[] parsesCom = com.split(String.valueOf(' '));
            if (parsesCom.length == 0) {
                continue;
            }
            switch (parsesCom[0]) {
                case "push":
                    _impl.push(Integer.valueOf(parsesCom[1]));
                    System.out.println("ok");
                    break;
                case "pop":
                    try {
                        System.out.println(_impl.pop());
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("error");
                    }
                    break;
                case "front":
                    try {
                        System.out.println(_impl.front());
                    } catch (IndexOutOfBoundsException ex) {
                        System.out.println("error");
                    }
                    break;
                case "size":
                    System.out.println(_impl.size());
                    break;
                case "clear":
                    _impl.clear();
                    System.out.println("ok");
                    break;
                default:
                    System.out.println("bye");
                    return;
            }
        }

    }
}

class Impl {
    private ArrayList<Integer> data;

    public Impl() {
        data = new ArrayList<>();
    }

    public int size() {
        return data.size();
    }

    public int front() {
        if (data.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return data.get(0);
    }

    public void push(Integer num) {
        data.add(num);
    }

    public int pop() {
        if (data.isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        int result = this.front();
        data.remove(0);
        return result;
    }

    public void clear() {
        data.clear();
    }
}