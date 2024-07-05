public class ShiftLeft {
    public int[] shiftLeft(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=1;i<nums.length;i++)
            a[i-1]=nums[i];
        if(nums.length>=1)
            a[nums.length-1]=nums[0];
        return a;
    }
}
