package String2;

public class GetSandwich {
    public String getSandwich(String str) {
        String ans="";
        int i=str.indexOf("bread"), j=str.lastIndexOf("bread");
        if(i!=j && i>=0 && j>=0){
            ans=str.substring(i+5,j);
        }
        return ans;
    }
}
