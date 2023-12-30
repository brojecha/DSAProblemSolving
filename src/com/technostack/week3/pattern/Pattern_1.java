package com.technostack.week3.pattern;

public class Pattern_1 {
    public static void main(String[] args) {
        int n = 4;
        printPattern_1(4);
    }

    static void printPattern_1(int n) {
        int i = 1;
        while (i <= n) {
            int column = 1;
            while (column <= i) {
                System.out.print("* ");
                column++;
            }
            i++;
            System.out.println();
        }
    }
}
