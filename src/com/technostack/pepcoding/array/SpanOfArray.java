package com.technostack.pepcoding.array;

import java.util.Scanner;

public class SpanOfArray {
    // span = array[max] - array[min]
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int span = spanOfArray(array);
        System.out.println(span);
    }

    static int maxArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
            }
            i++;
        }
        return max;
    }

    static int minArray(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        System.out.println(min);
        return min;

    }

    static int spanOfArray(int[] arr) {
        int spanArray = 0;
        int maxArray = maxArray(arr);
        System.out.println("MaxArray"+" "+maxArray);
        int minArray = minArray(arr);
        System.out.println("MinArray"+" "+minArray);
        spanArray = maxArray - minArray;
        return spanArray;
    }
}
