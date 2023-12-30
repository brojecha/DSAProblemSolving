package com.technostack.week3.pattern;

import java.util.Scanner;

public class Pattern_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printIsoscelesNumberPattern(n);
    }

    static void printIsoscelesNumberPattern(int n){

        for(int i = 1;i<=n;i++){

            for(int j = 0;j< n-i;j++){
                System.out.print(" ");
            }
            for (int k = 1;k<=i;k++){
                System.out.print(k);
            }
            for(int h = i-1;h>=1;h--){
                System.out.print(h);
            }
            System.out.println();
        }
    }
}
