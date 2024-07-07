package String1;

public class TwoChar {
    public String twoChar(String str, int index) {
        if(index>=0 && index+1<str.length())
            return str.charAt(index)+""+str.charAt(index+1);
        return str.substring(0,2);
    }
}
