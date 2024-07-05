public class Sum13 {
    public int sum13(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(i==0 && nums[i]!=13 )
                a+=nums[i];
            else if(nums[i]!=13 && nums[i-1]!=13)
                a+=nums[i];
        }
        return a;
    }
}
