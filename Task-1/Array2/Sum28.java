package Array2;

public class Sum28 {
    public boolean sum28(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i==2)
                c+=2;
        }
        return c==8;
    }
}
