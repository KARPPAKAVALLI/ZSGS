package com.task2;

import java.util.HashSet;

public class Code15 {
    //15) Java Program to print the duplicate elements of an array
    public static void main(String[] args) {
        int[] a = {4, 2, 3, 4, 2, 7, 8, 8, 9};
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for (int num : a) {
            if (!set.add(num)) {
                duplicates.add(num);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);
    }
}
