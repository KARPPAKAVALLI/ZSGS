package com.task2;

import java.util.Scanner;

public class Code2 {
    //2) Write a program to define the functionality of a Bitwise operators
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),b= sc.nextInt();
        System.out.println("Bitwise AND "+ (a&b));
        System.out.println("Bitwise OR "+ (a|b));
        System.out.println("Bitwise XOR "+ (a^b));
        System.out.println("Bitwise NOT "+ (~a));
        System.out.println("Bitwise RIGHT SHIFT "+ (a>>1));
        System.out.println("Bitwise ZERO RIGHT SHIFT "+ (a>>>1));
        System.out.println("Bitwise LEFT SHIFT "+ (a<<1));
    }
}
