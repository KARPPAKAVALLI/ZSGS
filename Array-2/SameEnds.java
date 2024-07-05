public class SameEnds {
    public boolean sameEnds(int[] nums, int len) {
        for(int i=0,j=nums.length-len;i<len;i++,j++){
            if(nums[i]!=nums[j])
                return false;
        }
        return true;
    }
}
