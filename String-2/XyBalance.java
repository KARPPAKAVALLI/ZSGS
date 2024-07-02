public class XyBalance {
    public boolean xyBalance(String str) {
        boolean f=false;
        for(int i=str.length()-1;i>=0;i--){
            if(f==false && str.charAt(i)=='x')
                return false;
            if(str.charAt(i)=='y')
                f=true;
        }
        return true;
    }
}
