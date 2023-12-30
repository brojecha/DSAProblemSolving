package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printTraiangularNumberPattern(n);
    }

    static void printTraiangularNumberPattern(int n) {
        int row = 1;
        while (row <= n) {
            int column = 1;
            while (column <= row){
                System.out.print(row);
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
