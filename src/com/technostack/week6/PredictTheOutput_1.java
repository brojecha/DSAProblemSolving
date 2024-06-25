package com.technostack.week6;

public class PredictTheOutput_1 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "abcd";
        String s3 = "myapple";
        String s4 = "a";
        System.out.println(s1.compareTo(s2)); //If string contain same value, compareTo method returns results 0,
        // it compare lexographicaly
        System.out.println(s1.compareTo(s3)); // while comparing string, if second string is bigger , it returns negative value
        System.out.println(s1.compareTo(s4)); //while comparing string, if first string is bigger it gives positive value
    }
}
