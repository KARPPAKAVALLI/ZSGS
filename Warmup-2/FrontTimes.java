public class FrontTimes {
    public String frontTimes(String str, int n) {
        String a="";
        if(str.length()>=3)
            str=str.substring(0,3);
        for(int i=0;i<n;i++)
            a+=str;
        return a;
    }
}
