package String2;

public class WordEnds {
    public String wordEnds(String str, String word) {
        String ans="";
        for(int i=0;i<str.length();i++){
            if(i+word.length()<=str.length() && str.substring(i,i+word.length()).equals(word)){
                if(i-1>=0)
                    ans+=str.charAt(i-1);
                if(i+word.length()<str.length())
                    ans+=str.charAt(i+word.length());
            }
        }
        return ans;
    }
}
