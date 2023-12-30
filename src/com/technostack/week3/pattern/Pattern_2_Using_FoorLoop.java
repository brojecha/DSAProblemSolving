package com.technostack.week3.pattern;

public class Pattern_2_Using_FoorLoop {
    public static void main(String[] args) {
        int n = 5;
        printPatternUsingForLoop(n);
    }

    static void printPatternUsingForLoop(int n) {
        //outer for loop is for rows
        //here for 1 row we are printing 5 column
        for (int row = 1; row <= n; row++) {
            //inner for loop is for column
            //for every row size we have to run the column for 5 times
            for (int column = 1; column <= n; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
