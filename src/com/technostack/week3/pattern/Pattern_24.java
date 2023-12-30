package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printOddSqure(n);
    }

    // not correct code.Need to change the code.
    static void printOddSqure(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 2*i-1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
