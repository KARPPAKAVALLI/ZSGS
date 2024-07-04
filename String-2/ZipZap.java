public class ZipZap {
    public String zipZap(String str) {
        String ans="";
        for(int i=0;i<str.length();i++){
            if(i+2<str.length() && str.charAt(i)=='z' && str.charAt(i+2)=='p'){
                ans+='z'+""+'p';
                i+=2;
            }
            else{
                ans+=str.charAt(i);
            }
        }
        return ans;
    }
}
