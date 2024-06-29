public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int max=Math.max(nums[0],nums[2]);
        nums[0]=nums[1]=nums[2]=max;
        return nums;
    }
}
