public class PlusOut {
    public String plusOut(String str, String word) {
        String ans="";
        for(int i=0;i<str.length();i++){
            if(i+word.length()<=str.length() && str.substring(i,i+word.length()).equals(word)){
                ans+=str.substring(i,i+word.length());
                i=i+word.length()-1;
            }
            else{
                ans+='+';
            }
        }
        return ans;
    }
}
