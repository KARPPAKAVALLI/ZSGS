package com.task2;

public class Code25 {
    public static void main(String[] args) {
        String input = "12345";
        int length = input.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j) {
                    System.out.print(input.charAt(i));
                } else if (i + j == length - 1) {
                    System.out.print(input.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
