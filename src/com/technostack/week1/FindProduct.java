package com.technostack.week1;

import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        findProductFactorial(n);
    }

    static void findProductFactorial(int n){
        int res = 0;
        for (int i = 0; i <= n; i++) {
             res = i*i;
        }
        System.out.println("Result : "+res);
    }
}
