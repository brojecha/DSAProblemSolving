package com.technostack.week3.pattern;

public class Pattern_5 {
    public static void main(String[] args) {
        int n = 4;
        printPattern5(n);
    }

    static void printPattern5(int n) {
        int row = 1;
        while (row <= n) {
            int column = 1;
            int val = 4;
            while (column <= n) {
                System.out.print(val + " ");
                column++;
                val--;
            }
            row++;
            System.out.println();

        }
    }
}
