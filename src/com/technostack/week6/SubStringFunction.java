package com.technostack.week6;

public class SubStringFunction {
    public static void main(String[] args) {
        String s = "coding";
        String s1 = " 12 / 1970";

        System.out.println("Substring with 0 index:"+""+s.substring(0));
        System.out.println("Substring :"+""+s.substring(1));
        System.out.println("Substring :"+""+s.substring(6));
        System.out.println("Substring :"+""+s.substring(5));

        System.out.println("Substring between value :"+" "+s.substring(0,5)); // the last index 5 is exclusive.
        // it returns value from length 1(s.length() method return length , which count start from 1 to end of string length) to last, which in this case 5.
        System.out.println("We have retreive the value 1970 through Substring method");
        System.out.println("Retrive the 1970 value :"+" "+s1.substring(6));
        System.out.println("Retrive the 1970 value :"+" "+s1.substring(6,10));
        //System.out.println("Retrive the 1970 value using charAt :"+" "+s1.substring(s1.charAt(0)));
        // it will give error because, substring methods takes parameter as index,but if we pass charAt() method, it will give error
        //because charAt method takes index, but return a char value.If we pass char value inside substring() method it will give error.
        //substring() method only takes index, which is int val. [Relation with Line no 18]

        System.out.println("Retrive the 1970 value :"+" "+s1.substring(6,9));
    }
}
