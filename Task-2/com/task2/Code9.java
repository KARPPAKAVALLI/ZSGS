package com.task2;

import java.util.Scanner;

public class Code9 {
    //9) Write a program to display the number in reverse order without use of String functions.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),a=0;
        while (n>0){
            a=a*10+n%10;
            n/=10;
        }
        System.out.println("The number in reverse order is : "+a);
    }
}
