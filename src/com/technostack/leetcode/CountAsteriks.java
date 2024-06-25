package com.technostack.leetcode;

public class CountAsteriks {
    public static void main(String[] args) {
        //String s = "l|*e*et|c**o|*de|";
        String s = "a|b|**c";
        //String s = "appleprogrammer";
        int value = countAsterisks(s);
        System.out.println("Value :"+value);
    }

    static int countAsterisks(String s) {
        boolean inBar = false; // Initialize to false
        int count = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) { // Loop through all characters
            if (s.charAt(i) == '|') {
                if (inBar) {
                    inBar = false;
                } else {
                    inBar = true;
                }
            } else if (s.charAt(i) == '*' && !inBar) {
                count++; // Count asterisks only if not inside bars
            }
        }
        return count;
    }
}
