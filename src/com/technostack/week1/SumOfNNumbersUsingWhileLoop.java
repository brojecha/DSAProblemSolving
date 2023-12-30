package com.technostack.week1;

public class SumOfNNumbersUsingWhileLoop {
    public static void main(String[] args) {
        int number = 5;
        int sum = 0;

        int i = 0;
        while (i <= number) {
            sum += i;
            i++;
        }
        System.out.println("Sum of N number :" + sum);
    }
}
