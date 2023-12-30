package com.technostack.week3.pattern;

public class Pattern3_Using_For_Loop {
    public static void main(String[] args) {
        int n = 4;
        printPattern3(n);
    }

    static void printPattern3(int n) {
        //outer for loop is for rows
        for (int row = 1; row <= n; row++) {
            //inner for loop is for column
            //we have to print row value
            // for row 1 print column 1 for 4 times
            for (int column = 1; column <= n; column++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
