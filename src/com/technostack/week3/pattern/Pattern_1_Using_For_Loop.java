package com.technostack.week3.pattern;

public class Pattern_1_Using_For_Loop {
    public static void main(String[] args) {
        int n = 4;
        printPattern1_UsingForLoop(n);
    }

    static void printPattern1_UsingForLoop(int n) {
        //outer loop is for rows
        //for one row one column is there
        for (int row = 1; row <= n; row++) {
            //inner loop is for column
            //for one row one column we have to print
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
