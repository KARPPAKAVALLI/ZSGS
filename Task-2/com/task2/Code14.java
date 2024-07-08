package com.task2;

import java.util.Arrays;

public class Code14 {
    //14) Java Program to copy all elements of one array into another array
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[a.length];
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(b));
    }
}
