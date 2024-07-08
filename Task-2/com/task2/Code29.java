package com.task2;

import java.util.Scanner;

public class Code29 {
    //29) Write a program to print the alphabet 'C' with the stars based on the given numbers
    //Eg 1:  Input: 4
    //        Output:
    //****
    //*
    //*
    //****
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            if(i==0||i==n-1){
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }
            else
                System.out.print("*");
            System.out.println();
        }
    }
}
