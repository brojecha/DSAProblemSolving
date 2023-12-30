package com.technostack.week1;

import java.util.Scanner;

public class CheckNumber_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = scanner.nextInt();
        if(n > 0){
            System.out.println(1);
        }else if(n < 0){
            System.out.println(-1);
        }else {
            System.out.println(0);
        }
    }
}
