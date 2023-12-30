package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_7_UsingForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printTraiangularPatternUsingForLoop(n);
    }

    static void printTraiangularPatternUsingForLoop(int n) {
        //outer for loop is for rows
        for (int row = 1; row <= n; row++) {
            //inner for loop is for column
            for (int column = 1; column <= row; column++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
