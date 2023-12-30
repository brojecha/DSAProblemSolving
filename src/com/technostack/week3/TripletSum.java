package com.technostack.week3;

import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int val = findTriplets(arr, x);
        System.out.println(val);
    }

    static int findTriplets(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
