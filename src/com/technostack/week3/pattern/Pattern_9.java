package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printReverseNumberPattern(n);
    }

    static void printReverseNumberPattern(int n) {
        int row = 1;
        while (row <= n) {
            int column = row;
            while (column >= 1) {
                System.out.print(column);
                column--;
            }
            row++;
            System.out.println();
        }
    }
}
