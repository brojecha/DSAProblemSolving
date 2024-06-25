package com.technostack.week6;

import java.util.ArrayList;
import java.util.List;

public class CharacterArrayDemoCombining {
    public static void main(String[] args) {
        char[] chArray = {'c','o','d','i','n','g'};
        char[] chars = {'g','a','m','e'};
        List<String> characters = printCharacterArrayCombiningDemo(chArray, chars);
        System.out.println(characters);
    }

    static List<String> printCharacterArrayCombiningDemo(char[]val1,char[] val2){
        List<String> myList = new ArrayList<>();
        String s1 = String.valueOf(val1);
        String s2 = String.valueOf(val2);
        myList.add(s1);
        myList.add(s2);
        return myList;
    }
}
