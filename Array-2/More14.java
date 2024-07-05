public class More14 {
    public boolean more14(int[] nums) {
        int a=0,b=0;
        for(int i:nums){
            if(i==1)
                a++;
            if(i==4 )
                b++;
        }
        return a>b;
    }
}
