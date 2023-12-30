package com.technostack.week3;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int val = countNoOfDigits(n);
        System.out.println(val);
    }

    static int countNoOfDigits(int number) {
        int count = 0; // local variable
        int rem = 0;
        while (number != 0) {
            rem = number % 10;
            number /= 10;
            count++;
        }
        return count;
    }
}
