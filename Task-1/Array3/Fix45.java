package Array3;

public class Fix45 {
    public int[] fix45(int[] nums) {
        int t=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=4 && nums[i]!=5){
                t=nums[i];
                break;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==4){
                nums[i+1]=5;
                i+=1;
            }
            else if(nums[i]==5){
                nums[i]=t;
            }
        }
        return nums;
    }
}
