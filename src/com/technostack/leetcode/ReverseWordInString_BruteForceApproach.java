package com.technostack.leetcode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordInString_BruteForceApproach {
    public static void main(String[] args) {
        String s = "hello world";
        List<String> s1 = List.of(s);
        String collect = s1.stream().map(string -> new StringBuilder(string).reverse()).collect(Collectors.joining());
        System.out.println("Collect val :"+collect);
        System.out.println("Print Reverse"+s1);
       // String val = reverSeWordsInString(s);
      //  System.out.println("Reversed Word :"+val);

    }

    static String reverSeWordsInString(String s){
        // 1. We need to split the words
        // 2. Once we split the words, we nned to reverse these words
        // 3. We need to convert this words to strings and trim the extra spaces

        String[] stArray = s.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i = stArray.length-1;i>=0;i--){
            sb.append(stArray[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
