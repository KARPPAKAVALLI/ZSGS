package String1;

public class ComboString {
    public String comboString(String a, String b) {
        if(b.length()<a.length())
            return b+a+b;
        return a+b+a;
    }
}
