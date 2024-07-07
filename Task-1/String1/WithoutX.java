package String1;

public class WithoutX {
    public String withoutX(String s) {
        if(s=="")
            return "";
        if(s.length()<=1){
            if(s.charAt(0)=='x')
                return "";
        }
        if(s.charAt(0)=='x')
            s=s.substring(1);
        if(s.charAt(s.length()-1)=='x')
            s=s.substring(0,s.length()-1);
        return s;
    }
}
