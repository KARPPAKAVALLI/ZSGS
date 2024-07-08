package com.task2;

import java.util.Scanner;

public class Code24 {
    //24) Write a program to make such a pattern like a pyramid with numbers increased by 1.
    //Eg:  Input : 10
    //Output:
    //     1
    //    2 3
    //  4 5 6
    //7 8 9 10
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=n/2-1;
        int currentNumber = 1;
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  "); // Two spaces for formatting
            }

            // Print numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(currentNumber + " ");
                currentNumber++;
            }

            // Move to the next line
            System.out.println();
        }
    }
}
