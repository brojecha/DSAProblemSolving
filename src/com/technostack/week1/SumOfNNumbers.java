package com.technostack.week1;

public class SumOfNNumbers {
    public static void main(String[] args) {
        int number = 5;
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println("Sum of N numbers :" + sum);
    }
}
