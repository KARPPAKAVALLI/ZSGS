package String3;

public class MirrorEnds {
    public String mirrorEnds(String s) {
        int i=0,j=s.length()-1;
        String ans="";
        while(i<s.length()){
            if(s.charAt(i)==s.charAt(j))
                ans+=s.charAt(i);
            else
                break;
            i++;
            j--;
        }
        return ans;
    }
}
