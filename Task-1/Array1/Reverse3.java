package com.Array1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int t=nums[2];
        nums[2]=nums[0];
        nums[0]=t;
        return nums;
    }
}
