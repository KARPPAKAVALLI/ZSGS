package Array2;

public class Has12 {
    public boolean has12(int[] nums) {
        boolean a=false;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)
                a=true;
            if(a && nums[i]==2 )
                return true;
        }
        return false;
    }
}
