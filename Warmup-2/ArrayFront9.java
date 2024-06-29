public class ArrayFront9 {
    public boolean arrayFront9(int[] nums) {
        if(nums.length<4){
            for(int i:nums){
                if(i==9)
                    return true;
            }
            return false;
        }
        for(int i=0;i<4;i++){
            if(nums[i]==9)
                return true;
        }
        return false;
    }
}
