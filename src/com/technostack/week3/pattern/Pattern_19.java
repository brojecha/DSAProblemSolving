package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printDiamondOfStarsPattern(n);
    }

    static void printDiamondOfStarsPattern(int n){
        //for rows
        int a = (n+1)/2;

        for(int i = 1;i<=a;i++) {
            //space print
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            for (int k = 1; k <i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i = 1; i<=n/2;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=n/2-i+1;j++){
                System.out.print("*");
            }
            for(int j = 1;j<=n/2-i;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
