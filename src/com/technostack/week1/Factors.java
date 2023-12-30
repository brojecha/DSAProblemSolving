package com.technostack.week1;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        //find factors of the numbers
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
