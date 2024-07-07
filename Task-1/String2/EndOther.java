package String2;

public class EndOther {
    public boolean endOther(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(b.length()<=a.length() && a.substring(a.length()-b.length()).equals(b))
            return true;
        if(a.length()<=b.length() &&  b.substring(b.length()-a.length()).equals(a))
            return true;
        return false;
    }
}
