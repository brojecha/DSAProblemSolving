package com.technostack.week6;

public class StringDemo {
    public static void main(String[] args) {
        String s = "Coding"; // String index always starts with 0
        char val = s.charAt(0);
        System.out.println("Print Char at value :"+val);
        System.out.println("Length of String :"+" "+s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));
        System.out.println(s.charAt(4));
        System.out.println(s.charAt(5));

        String s1 = "";
       // System.out.println(s1.length());
       // System.out.println(s1.charAt(-1));  It will give error because String does not contain any value and it is an empty string

    }
}
