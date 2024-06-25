package com.technostack.revision;

public class Performance {
    public static void main(String[] args) {
        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            System.out.print(series+ch);
        }

        System.out.println("a"+'a');
    }
}
