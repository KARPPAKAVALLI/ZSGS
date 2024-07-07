package Array2;

public class Sum67 {
    public int sum67(int[] nums) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==6){
                while(nums[i]!=7)
                    i++;
            }
            else{
                a+=nums[i];
            }
        }
        return a;
    }
}
