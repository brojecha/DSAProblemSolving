package com.technostack.week6;

public class CheckPalindromeString {
    public static void main(String[] args) {
        String s = "abcdba";
        boolean checkIfPalindromString = checkIfStringPalindrome(s);
        if(checkIfPalindromString){
            System.out.println("It is a Palindrome String :"+" "+checkIfPalindromString);
        }else {
            System.out.println("It is not a Palindrome String :" + " " + checkIfPalindromString);
        }
    }

    private static boolean checkIfStringPalindrome(String s) {
        boolean flag = false;
        String reversedString = "";
        for(int i = s.length() -1; i>= 0;i--){
            reversedString = reversedString + s.charAt(i);
        }
        if(s.length() == reversedString.length() && s.equals(reversedString)){
            flag = true;
            return flag;
        }
        return flag;
    }
}
