package com.task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Code18 {
    //18) Write a program to sort the elements in odd positions in descending order and
    //elements in ascending order.
    //Eg 1:  Input:  13,2 4,15,12,10,5
    //         Output: 13,2,12,10,5,15,4
    //Eg 2:  Input: 1,2,3,4,5,6,7,8,9
    //         Output: 9,2,7,4,5,6,3,8,1
    public static void main(String[] args) {
        int[] arr = {13, 2, 4, 15, 12, 10, 5};

        for (int i = 0; i < arr.length; i += 2) {
            for (int j = i + 2; j < arr.length; j += 2) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 1; i < arr.length; i += 2) {
            for (int j = i + 2; j < arr.length; j += 2) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
