public class EveryNth {
    public String everyNth(String str, int n) {
        String a="";
        for(int i=0;i<str.length();i+=n){
            a+=str.charAt(i);
        }
        return a;
    }
}
