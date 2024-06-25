package com.technostack.gfg.revision;

public class Solution {
    public static void main(String[] args) {
        String s = "";
        int val = countWords(s);
        System.out.println(val);
    }
    static int countWords(String s) {

        int n = s.length();
        int count = 0;
        String str = "";

        for(int i =0; i<n; i++){
            if(s.charAt(i) != ' ' && s.charAt(i)!='\\' ){
                str+=s.charAt(i);
            }
            else {

                if(str.length()!=0 ){
                    count++;
                    str="";
                }
                if(i < s.length()-1 && s.charAt(i)=='\\' && s.charAt(i+1)!='\\'){
                    i++;
                }
            }
            if(str.length()!=0 && i==n-1){
                count++;
            }
        }
        return count;
    }

    /*int countWords(String s) {
        // Remove leading and trailing spaces, tabs, and newlines
        s = s.trim();
        // Handle empty string case
        if (s.isEmpty())
        {             return 0;
        }
        int count = 0;
        boolean inWord = false;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // Check if the current character is a word character (alphabet)
            boolean isWordChar = (ch >= 'a' && ch <= 'z');
            if (isWordChar) {
                if (!inWord) {
                    // Start of a new word
                    /count++;
                    inWord = true;
                }
            } else {
                // Not a word character (space, tab, or newline)
                inWord = false;
            }
        }
        return count;
    }*/

    }
