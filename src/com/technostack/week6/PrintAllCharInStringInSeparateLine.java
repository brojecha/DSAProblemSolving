package com.technostack.week6;

import java.util.Scanner;

public class PrintAllCharInStringInSeparateLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val  = scanner.nextLine();
        for(int i = 0;i<val.length();i++){
            System.out.println("print character in separate line"+" "+val.charAt(i));
        }
    }
}
