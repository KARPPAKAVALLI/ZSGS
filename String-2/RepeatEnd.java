public class RepeatEnd {
    public String repeatEnd(String str, int n) {
        String a="";
        for(int i=0;i<n;i++){
            a+=str.substring(str.length()-n);
        }
        return a;
    }
}
