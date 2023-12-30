package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printSumPattern(n);
    }

    private static void printSumPattern(int n) {
        int sum = 0;
        for(int i = 1;i<=n;i++) {
            sum += i;
            System.out.print("1");
            for (int j = 2; j <= i; j++) {
                System.out.print("+" + j);
            }
            System.out.println("=" + sum);
        }
    }
}
