public class ArrayCount9 {
    public int arrayCount9(int[] nums) {
        int c=0;
        for(int i:nums){
            if(i==9) c++;
        }
        return c;
    }
}
