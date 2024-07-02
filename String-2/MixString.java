public class MixString {
    public String mixString(String a, String b) {
        String c="";
        int i=0;
        for(i=0;i<Math.min(a.length(),b.length());i++){
            c+=a.charAt(i);
            c+=b.charAt(i);
        }
        if(a.length()>b.length())
            c+=a.substring(i);
        if(b.length()>a.length())
            c+=b.substring(i);
        return c;
    }
}
