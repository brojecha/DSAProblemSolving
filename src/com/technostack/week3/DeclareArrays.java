package com.technostack.week3;

import java.sql.Array;
import java.util.Scanner;

public class DeclareArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to initilize an array");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print(" "+arr[i]);
        }



    }

}
