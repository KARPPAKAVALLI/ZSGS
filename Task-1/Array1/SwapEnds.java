package com.Array1;

public class SwapEnds {
    public int[] swapEnds(int[] nums) {
        int t=nums[0];
        nums[0]=nums[nums.length-1];
        nums[nums.length-1]=t;
        return nums;
    }
}
