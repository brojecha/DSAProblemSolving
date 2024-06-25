package com.technostack.gfg.revision;

public class CountNoOfWords {

   /* problem Link : https: www.geeksforgeeks.org/problems/count-number-of-words1500/1 */

    public static void main(String[] args) {
        String s = "I am a doctor";
       int print = countWords(s);
        System.out.println(print);
    }

   static int countWords(String s) {
        int count = 1;
        for (int i = 0;i < s.length();i++){
            if(s.charAt(i) == ' ' && s.charAt(i+1) != ' '){
                count++;
            }
        }
        return count;
    }
}
