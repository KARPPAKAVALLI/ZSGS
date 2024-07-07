package Array2;

import java.util.Arrays;

public class CenteredAverage {
    public int centeredAverage(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for(int i=1;i<nums.length-1;i++){
            c+=nums[i];
        }
        return c/(nums.length-2);
    }
}
