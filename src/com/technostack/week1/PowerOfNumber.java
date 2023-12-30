package com.technostack.week1;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        int x = scanner.nextInt();
        int res = 1;
        while (x > 0) {
            res *= base;
            x--;
        }

        System.out.println(res);
    }
}
