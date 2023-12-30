package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printMirrorImagePattern(n);
    }

    static void printMirrorImagePattern(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
