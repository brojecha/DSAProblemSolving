package com.technostack.week1;

import java.util.Scanner;

public class FindLargestOfN_Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        findLargestOfAllNumbers(n);
    }

    static void findLargestOfAllNumbers(int n){
        int currentLargest = 0;
        for(int i = 0;i<=n;i++){
            if(i > currentLargest) {
                currentLargest = i;
            }
        }
        System.out.println("Largest number among N :"+currentLargest);
    }
}
