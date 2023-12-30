package com.technostack.week1;

import java.util.Scanner;

public class FarenhiteToCelciusTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int E = scanner.nextInt();
        int W = scanner.nextInt();

        int celcius = 0;
        for (int i = S; i <= E; i += W) {
            celcius = (i - 32) * 5 / 9;
            System.out.println(i + " " + celcius);
        }
    }
}
