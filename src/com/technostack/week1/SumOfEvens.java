package com.technostack.week1;

import java.util.Scanner;

public class SumOfEvens {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
       int result = sumOfEvenNumbers(n);
        System.out.println("Result"+result);
    }

    static int sumOfEvenNumbers(int n) {
        int sum = 0; int curt= 2;
        for (int i = 1; i <= n; i++) {
            sum+=curt;

            curt+=2;
        }
        return sum;
    }
}
