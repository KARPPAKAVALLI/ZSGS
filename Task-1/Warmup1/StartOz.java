package Warmup1;

public class StartOz {
    public String startOz(String s) {
        String a="";
        if(s.length()>=1 && s.charAt(0)=='o')
            a+="o";
        if(s.length()>=2 && s.charAt(1)=='z')
            a+='z';
        return a;
    }

}
