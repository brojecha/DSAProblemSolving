package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printTriangularPattern(n);
    }

    static void printTriangularPattern(int n) {
        int row = 1;
        //here no of row == no of columns we have to print
        while (row <= n) {
            int column = 1;
            while (column <= row) {
                System.out.print("*");
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
