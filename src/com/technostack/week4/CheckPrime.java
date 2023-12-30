package com.technostack.week4;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        checkIfNoIsPrime(n);
    }

    static void checkIfNoIsPrime(int n) {
        int temp = 0;
        for(int i = 2;i<n-1;i++){
            if(n % i ==0){
                temp++;
            }
        }
        if(temp > 0){
            System.out.println(" No is not prime");
        }else
            System.out.println("No is prime");
    }
}
