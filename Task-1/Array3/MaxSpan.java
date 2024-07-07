package Array3;

public class MaxSpan {
    public int maxSpan(int[] nums) {
        if(nums.length==0)
            return 0;
        int max=1;
        for(int i=0;i<nums.length;i++){
            int k=-1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    k=j;
            }
            max=Math.max(k-i+1,max);
        }
        return max;
    }
}
