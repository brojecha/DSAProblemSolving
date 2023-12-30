package com.technostack.week1;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        int evenSum = 0, oddSum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        while (n > 0) {
            int last = n % 10;
            if (last % 2 == 0) {
                evenSum += last;
            } else {
                oddSum += last;
            }
            n/=10;
        }
        System.out.println(evenSum +" "+ oddSum);
    }
}
