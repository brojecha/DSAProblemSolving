package com.technostack.week6;

import java.util.Scanner;

public class TakeStringInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.next();
        System.out.println("Val length :"+" "+val.length());
        System.out.println("print only next token value until we any space encountered :"+" "+val);
        String val2 = scanner.nextLine();
        System.out.println("print val2 with all space :"+" "+val2);
        System.out.println("Length of Val2"+" "+val2.length());
    }
}
