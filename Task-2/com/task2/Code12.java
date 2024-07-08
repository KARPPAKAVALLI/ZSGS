package com.task2;

import java.util.Scanner;

public class Code12 {
    //12) Program to Check Whether a Character is an Alphabet or not
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        if(a>=97 && a<=122 || a>=65 && a<=90)
            System.out.println("The entered Character is an Alphabet");
        else
            System.out.println("The entered Character is not an Alphabet");
    }
}
