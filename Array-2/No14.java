public class No14 {
    public boolean no14(int[] nums) {
        boolean a=false,b=false;
        for(int i:nums){
            if(i==1)
                a=true;
            if(i==4)
                b=true;
        }
        return !(a && b);
    }
}
