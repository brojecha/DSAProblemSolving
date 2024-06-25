package com.technostack.week6;

public class printSubStringInaString {
    public static void main(String[] args) {
        // substring : a continuous sequence of characters within a string
        String str = "xyz";
        printSubString(str);
    }

    private static void printSubString(String str) {
        String val = null;

            for(int i = 0;i<=str.length();i++) {
                for (int j = i + 1; j <= str.length(); j++) {
                    val = str.substring(i, j);
                    System.out.println("Substring all Value :"+" "+val);
                }

            }

    }
}
