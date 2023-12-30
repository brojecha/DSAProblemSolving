package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printParallelogramPattern(n);
    }

    static void printParallelogramPattern(int n){

        for(int i = 1;i<=n;i++){
            for(int j = 1 ;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
            for(int k = 1;k<=i;k++){
                System.out.print(" ");
            }
        }
    }
}
