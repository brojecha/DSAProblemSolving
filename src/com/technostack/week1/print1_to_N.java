package com.technostack.week1;

import java.util.Scanner;

public class print1_to_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        printOneToN(n);
    }

    static void printOneToN(int n) {
        for (int i = 0; i <= n; i++) {
            System.out.println("Printing Value from 1 To N : "+i);
        }
    }
}
