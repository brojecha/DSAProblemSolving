package com.technostack.week3;

import java.util.Scanner;

public class AraySum {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int sumVal = sum(array);
        System.out.println("Sum" + " " + sumVal);
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
