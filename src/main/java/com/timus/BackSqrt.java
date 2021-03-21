package com.timus;

import java.util.Scanner;
import java.util.Stack;

public class BackSqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value;
        Stack<Double> numbers = new Stack<>();
        while (scanner.hasNext()) {
            value = scanner.nextDouble();
            numbers.add(value);
        }

        while(!numbers.empty()) {
            value = numbers.pop();
            System.out.println(Math.sqrt(value));

        }
    }
}
