package com.technostack.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter_Without_IndexOf {
    public static void main(String[] args) {
        String[] words = {"abc","az","erw","zwp"};
        char ch = 'p';
        List<Integer> indexContainingCharInWords = findIndexContainingCharInWords(words, ch);
        for(Integer val : indexContainingCharInWords){
            System.out.println("Print Index :"+" "+val);
        }
    }

    static List<Integer> findIndexContainingCharInWords(String[] words, char ch){
        List<Integer> listData = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            if(findIndexInWords(words[i],ch)){
                listData.add(i);
            }
        }
        return listData;
    }

    private static boolean findIndexInWords(String word,char ch) {
        boolean flag = false;
        for(int j = 0; j< word.length(); j++){
            if(word.charAt(j) == ch){
                flag = true;
            }
        }
        return flag;
    }
}
