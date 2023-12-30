package com.technostack.week3;

import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        int[] array = {1, 4, 3, 2, 6, 3, 2};
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int val = pairSum(array, n);
        System.out.println(val);
    }

    static int pairSum(int[] array, int x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == x) {
                    count++;
                   break;
                }
            }
        }
        return count;
    }
}
