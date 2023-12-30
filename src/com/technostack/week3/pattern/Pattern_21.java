package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        printHalfDiamondPatternWithStarAndNumeric(n);

    }

    static void printHalfDiamondPatternWithStarAndNumeric(int n){
        if(n==0){
            System.out.println("*");
            System.out.println("*");
            return;
        }
        System.out.println("*");
        for(int i = 1;i<=n;i++){
            System.out.print("*");
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            for(int j = i-1; j>=1;j--){
                System.out.print(j);
            }
            System.out.println("*");
        }
        for(int i = n-1;i>=1;i--){
            System.out.print("*");
            for(int j = 1;j<=i;j++){
                System.out.print(j);
            }
            for(int j = i-1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("*");
        }
        System.out.println("*");
        System.out.println();
    }
}
