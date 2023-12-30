package com.technostack.week2;

import java.util.Scanner;

public class FinonaceeNumberTill_N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();

        int x = 0;
        int y = 1;
        int res = 0;
        while (res <= n) {

            x = y;
            y = res;
            System.out.println(res);
            res = x + y;
        }

    }
}
