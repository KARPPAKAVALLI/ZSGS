package Array2;

public class Either24 {
    public boolean either24(int[] nums) {
        boolean a=false,b=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==2 &&nums[i+1]==2 )
                a=true;
            else if(nums[i]==4 &&nums[i+1]==4 )
                b=true;
        }
        return (a ^ b);
    }
}
