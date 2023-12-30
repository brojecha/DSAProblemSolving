package com.technostack.week2;

import java.util.Scanner;

public class FibonaceeSeriesTill_NthTerm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int x = 0;
        int y = 1;
        int term = 1;
        int res = 0;

        while (term <= num) {
            x = y;
            y = res;
            res = x + y;

            term++;

        }
        System.out.println(res);
    }
}
