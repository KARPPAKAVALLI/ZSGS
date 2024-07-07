package Warmup1;

public class Front3 {
    public String front3(String str) {
        String ans="";
        if(str.length()>=3){
            for(int i=0;i<3;i++)
                ans+=str.substring(0,3);
        }
        else{
            for(int i=0;i<3;i++)
                ans+=str;
        }
        return ans;
    }
}
