public class DoubleChar {
    public String doubleChar(String str) {
        String a="";
        for(int i=0;i<str.length();i++){
            a+=str.charAt(i);
            a+=str.charAt(i);
        }
        return a;
    }

}
