package String1;

public class ConCat {
    public String conCat(String a, String b) {
        if(a.length()<1||b.length()<1)
            return a+b;
        if(a.charAt(a.length()-1)==b.charAt(0))
            return a+b.substring(1);
        return a+b;
    }
}
