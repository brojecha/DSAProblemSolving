package com.technostack.week6;

public class StringFunctionDemo {
    public static void main(String[] args) {
        String s1 = "Coding is";
        String s2 = "fun";
        String s = additionOfString(s1, s2);
        System.out.println("Print Addition of Strings :"+" "+ s);
        String s3 = "fun";
        System.out.println("Print Equals methods results :"+" "+s2.equals(s3));
        System.out.println("Comparing the String lexographically :"+s2.compareTo(s3));
        System.out.println("Check wheather String string contain partcular value :"+""+s2.contains("un"));

    }

    static String additionOfString(String s1,String s2){
        // String val = s1 += s2;
         return s1.concat(s2);
    }
}
