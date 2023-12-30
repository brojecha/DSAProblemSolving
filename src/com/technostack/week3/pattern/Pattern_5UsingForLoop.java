package com.technostack.week3.pattern;

public class Pattern_5UsingForLoop {
    public static void main(String[] args) {
        int n = 4;
        printPattern5UsingForLoop(n);
    }

    static void printPattern5UsingForLoop(int n) {
        //outer loop is for rows
        int row;

        for (row = 1; row <= n; row++) {
            int val = 4;
            // inner loop is for column
            for (int column = 1; column <= n; column++) {
                System.out.print(val + " ");
                val--;
            }
            System.out.println();
        }
    }
}
