package Warmup2;

public class AltPairs {
    public String altPairs(String str) {
        String a="";
        for(int i=0;i<str.length();i+=4){
            a+=str.charAt(i);
            if(i+1<str.length())
                a+=str.charAt(i+1);
        }
        return a;
    }
}
