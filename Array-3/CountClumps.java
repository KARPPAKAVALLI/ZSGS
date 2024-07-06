public class CountClumps {
    public int countClumps(int[] nums) {
        int a=1,b=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                a++;
            }
            else{
                if(a>=2)
                    b++;
                a=1;
            }
        }
        if(a>=2)
            b++;
        return b;
    }
}
