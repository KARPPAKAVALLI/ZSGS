package Array2;

public class ZeroMax {
    public int[] zeroMax(int[] nums) {
        if(nums.length==0)
            return nums;
        int max=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]%2!=0){
                max=Math.max(nums[i],max);
            }
            else if(nums[i]==0){
                if(max%2!=0)
                    nums[i]=max;
            }
        }
        return nums;
    }
}
