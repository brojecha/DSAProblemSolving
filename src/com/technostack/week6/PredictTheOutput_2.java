package com.technostack.week6;

public class PredictTheOutput_2 {
    public static void main(String[] args) {
        String a = "coding";
        String b = "ninjas";
        if(a.contains("ing")){
           a+=b;
            System.out.println(a);
        }else{
            b+="ing";
        }
        System.out.println(b+a);
    }
}
