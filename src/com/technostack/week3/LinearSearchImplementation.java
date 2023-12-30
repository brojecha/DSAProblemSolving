package com.technostack.week3;

import java.util.Scanner;

public class LinearSearchImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int[] arr = {12, 56, 7, 89, 90};
        int val = linearSearchImplementation(arr, d);
        System.out.println("Index" + " " + val);
    }

    static int linearSearchImplementation(int[] arr, int d) {
        int index = -1;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == d) {
                index = i;
                break;
            }
        }
        return index;
    }
}
