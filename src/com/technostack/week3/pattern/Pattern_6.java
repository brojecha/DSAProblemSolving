package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printSqurePattern(n);
    }

    static void printSqurePattern(int n) {
        int row = 1;
        while (row <= n) {
            int column = 1;
            while (column <= n) {
                System.out.print(n + " ");
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
