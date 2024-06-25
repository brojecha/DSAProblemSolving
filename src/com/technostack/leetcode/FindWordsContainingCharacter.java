package com.technostack.leetcode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words = {"abc","bbc","ad","ed"};
        //String[] mywords = {"my name is bikash"};
        char x = 'z';
       List<Integer> wordsContainingCharacter = findWordsContainingCharacter(words, x);
        System.out.println(wordsContainingCharacter);
        for(Integer val : wordsContainingCharacter){
            System.out.println("Index containing char :"+" "+val);
        }
    }

    static List<Integer> findWordsContainingCharacter(String[] words, char x){
        List<Integer> alList = new ArrayList<>();
        for(int i = 0;i<words.length;i++){
            if(words[i].indexOf(x) != -1 ){
                alList.add(i);
            }
        }
        return alList;
    }
}
