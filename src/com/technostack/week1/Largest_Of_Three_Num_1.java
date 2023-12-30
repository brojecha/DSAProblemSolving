package com.technostack.week1;

import java.util.Scanner;

public class Largest_Of_Three_Num_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        largestOfThreeNumbers(a, b, c);
    }

    static void largestOfThreeNumbers(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("A is greater" + a);
        } else if (b > a && b > c) {
            System.out.println("B is greater" + b);
        } else {
            System.out.println("C is greater" + c);
        }
    }
}
