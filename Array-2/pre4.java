public class pre4 {
    public int[] pre4(int[] nums) {
        int n=0,i=0;
        for(;i<nums.length;i++){
            if(nums[i]==4){
                n=i;
                break;
            }
        }
        int a[]=new int[i];
        for(int j=0;j<i;j++)
            a[j]=nums[j];
        return a;
    }
}
