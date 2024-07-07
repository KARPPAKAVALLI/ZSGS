package Array2;

public class Has22 {
    public boolean has22(int[] nums) {
        boolean f=false;
        for(int i=0;i<nums.length;i++){
            if(i+1<nums.length && nums[i]==2 && nums[i+1]==2)
                f=true;
        }
        return f;
    }
}
