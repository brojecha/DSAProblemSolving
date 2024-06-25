package com.technostack.week6;

public class CountWordsInString {
    public static void main(String[] args) {
        String s = "I love java";
        int val = countWordsInString(s);
        System.out.println("Total no of words in string"+" "+val);
    }

    static int countWordsInString(String words){
        int len = words.length();
        int wordCount = 1;
        for(int i = 0;i<len-1;i++){

           if(words.charAt(i) == ' ' && words.charAt(i+1) != ' '){
               wordCount++;
           }
        }
        return wordCount;
    }
}
