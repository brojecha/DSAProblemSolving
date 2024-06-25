package com.technostack.week6;

import java.util.Locale;

public class CheckStringPalindrome_WithAnotherApproach {

    //This is a Wrong Approach
    public static void main(String[] args) {
        String str = "caeetcc";
        boolean value = checkStringPalindromeWithAnotherApproach(str);
        if(value){
            System.out.println("The string is palindrome :"+" "+value);
        }else {
            System.out.println("The string is not palindrome :"+" "+value);
        }
    }

    private static boolean checkStringPalindromeWithAnotherApproach(String str) {
        boolean flag = false;
        char first = str.toLowerCase().charAt(0);
        char last = str.toLowerCase().charAt(str.length() - 1);
        if(first == last){
            flag = true;
            return flag;
        }
        return flag;
    }
}
