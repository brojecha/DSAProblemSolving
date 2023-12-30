package com.technostack.week4;

import java.util.Scanner;

public class FibonaceeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printFibonaceeNumber(n);
    }

    static void printFibonaceeNumber(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 0;i<n;i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(" "+c);
        }

    }
}
