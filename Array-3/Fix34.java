public class Fix34 {
    public int[] fix34(int[] nums) {
        int t=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==3){
                t=nums[i+1];
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==3){
                nums[i+1]=4;
                i+=1;
            }
            else if(nums[i]==4){
                nums[i]=t;
            }
        }
        return nums;
    }
}
