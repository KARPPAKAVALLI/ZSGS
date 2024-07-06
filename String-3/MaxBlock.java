public class MaxBlock {
    public int maxBlock(String str) {
        if(str.length()==0)
            return 0;
        int a=1,b=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                a++;
            }
            else{
                b=Math.max(b,a);
                a=1;
            }
        }
        b=Math.max(b,a);
        return b;
    }
}
