package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printCharacterPattern(n);
    }

    static void printCharacterPattern(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print((char)(63+i+j));
            }
            System.out.println();
        }
    }
}
