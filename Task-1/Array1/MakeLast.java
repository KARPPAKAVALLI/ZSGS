package com.Array1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int a[]=new int[nums.length*2];
        a[nums.length*2-1]=nums[nums.length-1];
        return a;
    }
}
