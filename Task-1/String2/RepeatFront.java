package String2;

public class RepeatFront {
    public String repeatFront(String str, int n) {
        String a="";
        for(int i=0;i<n;i++){
            a+=str.substring(0,n-i);
        }
        return a;
    }
}
