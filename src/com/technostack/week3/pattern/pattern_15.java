package com.technostack.week3.pattern;

import java.util.Scanner;

public class pattern_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printInvertedTrianglePattern(n);
    }

    static void printInvertedTrianglePattern(int n){
        for(int i = 1;i <= n;i++){
            for(int j = 1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
