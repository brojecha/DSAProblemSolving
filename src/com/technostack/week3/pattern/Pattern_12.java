package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printInterestingAplhabets(n);
    }
    static void printInterestingAplhabets(int n){
        for(int i = 1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                char val = (char) ('@' + n + j-i);
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
