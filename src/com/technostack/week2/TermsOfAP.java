package com.technostack.week2;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int term = scanner.nextInt();
        int val = 0;
        int n = 0;
        while (n <= term) {
             val = 3 * n + 2;
            n++;
            if (val % 4 != 0) {
                System.out.println(val);
            }
        }

    }
}
