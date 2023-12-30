package com.technostack.week2;

import java.util.Scanner;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int product = 1;
        int N = scanner.nextInt();
        int C = scanner.nextInt();

        if (C == 1 && N <= 12) {
            for (int i = 0; i <= N; i++) {
                sum += i;
            }
            System.out.println(sum);
        } else if (C == 2 && N <= 12) {
            for (int i = 1; i <= N; i++) {
                product *= i;
            }
            System.out.println(product);
        } else {
            System.out.println(-1);
        }
    }
}
