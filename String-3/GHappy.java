public class GHappy {
    public boolean gHappy(String str) {
        if(str.length()==1)
            return !(str.charAt(0)=='g');
        for(int i=0;i<str.length();i++){
            if(i==0 && str.charAt(i)=='g' && str.charAt(i+1)!='g')
                return false;
            else if(i==str.length()-1 && str.charAt(i)=='g' && str.charAt(i-1)!='g')
                return false;
            else if(i>=0 && i<str.length()-1 && str.charAt(i)=='g' && str.charAt(i+1)!='g' && str.charAt(i-1)!='g' )
                return false;
        }
        return true;
    }
}
