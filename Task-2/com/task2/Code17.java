package com.task2;

import java.util.Arrays;

public class Code17 {
    //17) Alternate sorting: Given an array of integers, rearrange the array in such a way that
    //the first element is first maximum and second element is first minimum.
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        Arrays.sort(a);
        int[] sort = new int[a.length];
        int left = 0, right = a.length - 1;
        int idx = 0;
        while (left <= right) {
            if (idx % 2 == 0) {
                sort[idx++] = a[right--];
            } else {
                sort[idx++] = a[left++];
            }
        }
        System.out.println(Arrays.toString(sort));
    }
}
