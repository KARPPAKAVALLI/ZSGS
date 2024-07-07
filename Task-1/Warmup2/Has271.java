package Warmup2;

public class Has271 {
    public boolean has271(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]+5==nums[i+1] && Math.abs(nums[i]-nums[i+2]-1)<=2)
                return true;
        }
        return false;
    }
}
