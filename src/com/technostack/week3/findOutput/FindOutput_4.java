package com.technostack.week3.findOutput;

public class FindOutput_4 {
    public static void main(String[] args) {
        for(int i = 1;;i++){
            if(i > 5){
                break;
                //System.out.print("Break statement reached");
            }
            System.out.print(i);
        }
    }

    //Note :  The code is going to give error,because of break keyword. Unreachable statement. [Line no 8]
}
