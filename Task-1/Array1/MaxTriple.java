package com.Array1;

public class MaxTriple {
    public int maxTriple(int[] nums) {
        int a=Math.max(nums[nums.length/2],nums[0]);
        return Math.max(a,nums[nums.length-1]);
    }
}
