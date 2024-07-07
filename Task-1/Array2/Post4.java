package Array2;

public class Post4 {
    public int[] post4(int[] nums) {
        int n=0,i=0;
        for(;i<nums.length;i++){
            if(nums[i]==4){
                n=i;
            }
        }
        int a[]=new int[nums.length-(n+1)];
        for(int j=n+1;j<nums.length;j++)
            a[j-(n+1)]=nums[j];
        return a;
    }
}
