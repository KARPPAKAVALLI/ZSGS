package com.task2;

import java.util.Scanner;

public class Code5 {
    //5) Write a program to evaluate the polynomial equation
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //ax^2+bx+c
        System.out.println("Enter the co-efficients ax^2+bx+c");
        double a= sc.nextDouble(), b= sc.nextDouble(), c= sc.nextDouble();
        double x1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        double x2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println("The roots are: x1 = "+x1+" x2 = "+x2);
    }
}
