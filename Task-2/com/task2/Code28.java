package com.task2;

import java.util.Scanner;

public class Code28 {
    //28) Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
    //1111 +.. n terms.
    //Eg 1: Input:  Input the number of terms : 5
    //Output :
    //1 + 11 + 111 + 1111 + 11111
    //The Sum is : 12345
    //Eg 2: Input:  Input the number of terms : 3
    //Output :
    //1 + 11 + 111
    //The Sum is : 123
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i=0;
        int a=1,sum=0;
        while (i<n){
            sum+=a;
            a=a*10+1;
            i++;
        }
        System.out.println(sum);
    }
}
