package Array2;

public class EvenOdd {
    public int[] evenOdd(int[] nums) {
        int a[]=new int[nums.length];
        int j=0;
        for(int i:nums){
            if(i%2==0)
                a[j++]=i;
        }
        for(int i:nums){
            if(i%2!=0)
                a[j++]=i;
        }
        return a;
    }
}
