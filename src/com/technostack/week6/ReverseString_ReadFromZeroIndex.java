package com.technostack.week6;

public class ReverseString_ReadFromZeroIndex {
    public static void main(String[] args) {
        String s = "coding";
        String val = reverseString_ReadFromZeroIndex(s);
        System.out.println("Reversed String value"+" "+val);
    }

    private static String reverseString_ReadFromZeroIndex(String s) {
        String reversedString = "";
        //reading the loop from zero index and get the current char based on index and add it to the beginning of the reversedString.
        for(int i = 0;i<=s.length()-1;i++){
            reversedString = String.valueOf(s.charAt(i)) + reversedString;
        }
        return reversedString;
    }
}
