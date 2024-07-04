public class StarOut {
    public String starOut(String str) {
        String ans="";
        for (int i = 0; i < str.length(); i++){
            if(i==0){
                if(i+1<str.length() && str.charAt(i+1)!='*' && str.charAt(i)!='*')
                    ans+=str.charAt(i);
                else if(i+1>=str.length() && str.charAt(i)!='*')
                    ans+=str.charAt(i);
            }
            else if(i== str.length()-1){
                if(i-1>=0 && str.charAt(i-1)!='*' && str.charAt(i)!='*')
                    ans+=str.charAt(i);
            }
            else if(str.charAt(i+1)!='*' && str.charAt(i-1)!='*' && str.charAt(i)!='*' ){
                ans+=str.charAt(i);
            }
        }
        return ans;
    }

}
