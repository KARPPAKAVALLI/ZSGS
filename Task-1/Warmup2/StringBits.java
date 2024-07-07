package Warmup2;

public class StringBits {
    public String stringBits(String str) {
        String a="";
        for(int i=0;i<str.length();i+=2)
            a+=str.charAt(i);
        return a;
    }
}
