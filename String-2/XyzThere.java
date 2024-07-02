public class XyzThere {
    public boolean xyzThere(String str) {
        for(int i=0;i<str.length()-2;i++){
            if((i==0 || str.charAt(i-1)!='.') && str.substring(i,i+3).equals("xyz"))
                return true;
        }
        return false;
    }
}
