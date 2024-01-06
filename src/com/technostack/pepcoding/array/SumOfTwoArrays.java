package com.technostack.pepcoding.array;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int[] a1 = new int[n1];

        for (int i = 0; i < n1; i++) {
            a1[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int[] a2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            a2[i] = scanner.nextInt();
        }

        int[] ans = sumOfTwoArrays(a1, a2);

    }

    private static int[] sumOfTwoArrays(int[] a1, int[] a2) {
        return new int[a1.length+a2.length+1];
    }

}




