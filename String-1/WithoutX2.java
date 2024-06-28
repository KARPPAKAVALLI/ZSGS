public class WithoutX2 {
    public String withoutX2(String s) {
        if(s.length()>=2 && s.charAt(0)=='x' && s.charAt(1)=='x')
            s=s.substring(2);
        else if(s.length()>=1 && s.charAt(0)=='x')
            s=s.substring(1);
        else if(s.length()>=2 && s.charAt(1)=='x')
            s=s.charAt(0)+s.substring(2);
        return s;
    }
}
