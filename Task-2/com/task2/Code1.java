package com.task2;

import java.util.Scanner;

public class Code1 {
    //1) Write a program to print a letters from the user input character to 'Z' without using strings.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        while (c<='Z'){
            System.out.print(c);
            c=(char)(c+1);
        }
    }
}
