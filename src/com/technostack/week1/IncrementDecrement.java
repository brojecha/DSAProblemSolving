package com.technostack.week1;

public class IncrementDecrement {
    public static void main(String[] args) {
        int a = 60;
        int b = 80;
        if (a++ > 60 && b++ > 80) {
            System.out.println("Inside if");
        } else {
            System.out.println("Inside else");
        }
        System.out.println("a" + a + " " + "b" + b);
    }
}
