package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printMirrorImageNumberPattern(n);
    }

    static void printMirrorImageNumberPattern(int n){
        // first forr loop for row wise movement
        for(int i = 1;i<=n;i++){
            //second for loop for space printing
            for(int j = 0;j<n-i;j++){
                System.out.print(" ");
            }
            //k for loop is used for number printing
            for(int k = 1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
