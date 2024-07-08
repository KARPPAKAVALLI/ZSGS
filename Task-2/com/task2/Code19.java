package com.task2;

import java.util.Arrays;

public class Code19 {
    //19) Java Program to left rotate the elements of a multidimensional array.
    //20, 21, 22, 23)
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }

        int rows = a.length;
        // Rotate row left by one position
        for (int i = 0; i < rows; i++) {
            int temp = a[i][0];
            for (int j = 0; j < a[i].length - 1; j++) {
                a[i][j] = a[i][j + 1];
            }
            a[i][a[i].length - 1] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
