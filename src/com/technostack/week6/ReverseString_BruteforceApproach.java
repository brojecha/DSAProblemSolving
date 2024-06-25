package com.technostack.week6;

public class ReverseString_BruteforceApproach {
    public static void main(String[] args) {
        String str = "abcde";
        String val = reverseStringUsingBruteForce(str);
        System.out.println("reversed String is :"+" "+val);
    }

    private static String reverseStringUsingBruteForce(String str) {

        String reversedString = "";
        for(int i = str.length()-1 ;i >= 0;i--){
            //We are reading the string value from last index and decreasing the value by 1
            // On each iteration we are getting the ith value[index value] and pass it to charAt() method to get the char value based on index
            // and attaching the chr to an empty string.[The empty string hold the reversed value of string]
            reversedString = reversedString+=str.charAt(i);
        }
        return reversedString;
    }
}
