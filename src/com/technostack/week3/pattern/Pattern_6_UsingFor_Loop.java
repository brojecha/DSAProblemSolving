package com.technostack.week3.pattern;

public class Pattern_6_UsingFor_Loop {
    public static void main(String[] args) {
        int n = 6;
        printsqurePatternUsingForLoop(n);

    }

    static void printsqurePatternUsingForLoop(int n) {
        //outer for loop is for rows
        for (int rows = 1; rows <= n; rows++) {
            //inner for loop for column
            for (int column = 1; column <= n; column++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

    }
}
