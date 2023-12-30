package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printInvertedNumberPattern(n);
    }
     static void printInvertedNumberPattern(int n){
        //no of rows
        for(int i = n;i>=1;i--){
            for(int j = 1; j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
     }
}
