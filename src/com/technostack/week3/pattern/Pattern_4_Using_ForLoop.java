package com.technostack.week3.pattern;

public class Pattern_4_Using_ForLoop {
    public static void main(String[] args) {
        int n = 4;
        printPattern_4_UsingForLoop(n);
    }

    static void printPattern_4_UsingForLoop(int n) {
        // outer for loop is for rows
        for (int row = 1; row <= n; row++) {
            //inner for loop is for column
            //here we have to print for every row the column values increases like 1 2 3 4
            for (int column = 1; column <= n; column++) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}
