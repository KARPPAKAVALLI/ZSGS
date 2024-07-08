package com.task2;

import java.util.Scanner;

public class Code11 {
    //11) Write a program to give the following output for the given input:
    //Eg 1:  Input: a1b10
    //Output: abbbbbbbbbb
    //Eg: 2:  Input: b3c6d15
    //           Output: bbbccccccddddddddddddddd
    //The number varies from 1 to 99.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),b="";
        char a=s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                b+=s.charAt(i);
            }
            else{
                for (int j = 0; j < Integer.valueOf(b); j++) {
                    System.out.print(a);
                }
                a=s.charAt(i);
                b="";
            }
        }
        for (int j = 0; j < Integer.valueOf(b); j++) {
            System.out.print(a);
        }
    }
}
