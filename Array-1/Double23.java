public class Double23 {
    public boolean double23(int[] nums) {
        int a=0,b=0;
        for(int i:nums){
            if(i==2)
                a++;
            else if(i==3)
                b++;
        }
        return a>=2||b>=2;
    }
}
