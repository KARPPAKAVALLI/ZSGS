package com.task2;

import java.util.ArrayList;

public class Code16 {
    //16) Given two sorted arrays, merge them such that the elements are not repeated
    public static void main(String[] args) {
        int[] a = {2,4,5,6,7,9,10,13};
        int[] b = { 2,3,4,5,6,7,8,9,11,15};
        ArrayList<Integer> c = new ArrayList<>();
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                if (c.isEmpty() || c.get(c.size() - 1) != a[i]) {
                    c.add(a[i]);
                }
                i++;
            }
            else if (a[i] > b[j]) {
                if (c.isEmpty() || c.get(c.size() - 1) != b[j]) {
                    c.add(b[j]);
                }
                j++;
            }
            else {
                if (c.isEmpty() || c.get(c.size() - 1) != a[i]) {
                    c.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while (i < a.length) {
            if (c.isEmpty() || c.get(c.size() - 1) != a[i]) {
                c.add(a[i]);
            }
            i++;
        }
        while (j < b.length) {
            if (c.isEmpty() || c.get(c.size() - 1) != b[j]) {
                c.add(b[j]);
            }
            j++;
        }
        System.out.println("Merged: " + c);
    }
}
