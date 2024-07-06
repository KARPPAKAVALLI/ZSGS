public class EqualIsNot {
    public boolean equalIsNot(String str) {
        int a=0,b=0;
        for(int i=0;i<str.length();i++){
            if(i+2<=str.length() && str.substring(i,i+2).equals("is"))
                a++;
            if(i+3<=str.length() && str.substring(i,i+3).equals("not"))
                b++;
        }
        return a==b;
    }
}
