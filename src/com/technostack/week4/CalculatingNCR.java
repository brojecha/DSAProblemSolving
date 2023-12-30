package com.technostack.week4;

import java.util.Scanner;

public class CalculatingNCR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        calculatingNCRFactorial(n,r);
    }

    static void calculatingNCRFactorial(int n, int r){
        int result = 0;
        int factN = 1;
        for(int i = 1;i<=n;i++){
            factN = factN * i;
        }
        int factR = 1;
        for(int i = 1;i<=r;i++){
            factR = factR * i;
        }

        int factNR = 1;
        for(int i = 1;i <= n -r;i++){
            factNR = factNR * i;
        }
        result = factN / (factR * factNR);
        System.out.println("Result"+" "+result);
    }
}
