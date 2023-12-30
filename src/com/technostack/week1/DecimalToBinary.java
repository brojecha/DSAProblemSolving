package com.technostack.week1;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int rem = 0;
        while (num != 0) {
            rem = num % 2;

            num = num/2;
        }
        System.out.println("Decimal to Binary Conversion"+rem);
    }
}
