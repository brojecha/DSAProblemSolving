package com.technostack.week3;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        convertBinaryToDecimal(n);
    }
    static void convertBinaryToDecimal(int n){
        int ans = 0;
        int i = 0;
        while(n >0){
           int mod =  n % 10;
           n = n/10;
           ans = ans+mod*(int)Math.pow(2,i++);
        }
        System.out.println(ans);
    }
}
