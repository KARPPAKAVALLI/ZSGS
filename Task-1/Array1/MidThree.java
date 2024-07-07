package com.Array1;

public class MidThree {
    public int[] midThree(int[] nums) {
        return new int[]{nums[nums.length/2-1],nums[nums.length/2],nums[nums.length/2+1]};
    }
}
