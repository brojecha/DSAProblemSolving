package com.technostack.week3.pattern;

public class pattern_2 {
    public static void main(String[] args) {
        int n = 5;
        printPattern_2(n);
    }

    static void printPattern_2(int n) {
        int row = 1;
        while (row <= n) {
            int column = 1;
            while (column <= n) {
                System.out.print("* ");
                column++;
            }
            row++;
            System.out.println();
        }
    }
}
