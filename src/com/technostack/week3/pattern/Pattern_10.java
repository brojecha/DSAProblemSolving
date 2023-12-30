package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_10 {
    // Alpha Pattern

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printAlphaPattern(n);
    }

    static void printAlphaPattern(int n){
        for(int i = 1;i <=n;i++){
            char val = (char)('A'+i-1);
            for(int j = 1;j<=i;j++){

                System.out.print(val);
            }
            System.out.println();
        }
    }
}
