package String2;

public class BobThere {
    public boolean bobThere(String str) {
        for(int i=0;i<str.length();i++){
            if(i+2<str.length() && str.charAt(i)=='b' && str.charAt(i+2)=='b')
                return true;
        }
        return false;
    }
}
