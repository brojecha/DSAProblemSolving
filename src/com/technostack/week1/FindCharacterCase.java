package com.technostack.week1;

import java.util.Scanner;

public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char value = scanner.next().charAt(0);
        if(Character.isUpperCase(value)){
            System.out.println(1);
        }else if(Character.isLowerCase(value)){
            System.out.println(0);
        }else {
            System.out.println(-1);
        }
    }
}
