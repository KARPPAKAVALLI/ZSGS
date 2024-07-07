package com.Array1;

public class RotateLeft3 {
    public int[] rotateLeft3(int[] nums) {
        int t=nums[2];
        nums[2]=nums[0];
        nums[0]=nums[1];
        nums[1]=t;
        return nums;
    }
}
