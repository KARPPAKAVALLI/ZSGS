package com.task2;

public class Code27 {
    //27) Find if a String2 is substring of String1. If it is, return the index of the first
    //occurrence. else return -1.
    //Eg 1: Input: String 1: test123string
    //          String 2: 123
    //         Output: 4
    //Eg 2:  Input: String 1: testing12
    //         String 2: 1234
    //         Output: -1
    public static void main(String[] args) {
        String a="test123string",b="123";
        boolean f=false;
        for (int i=0;i<a.length();i++){
            if(i+b.length()<=a.length() && a.substring(i,i+b.length()).equals(b)){
                System.out.println(i);
                f=true;
                break;
            }
        }
        if(!f)
            System.out.println(-1);
    }
}
