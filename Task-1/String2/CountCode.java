package String2;

public class CountCode {
    public int countCode(String str) {
        int c=0;
        for(int i=0;i<str.length()-3;i++){
            if(str.substring(i,i+2).equals("co") && str.charAt(i+3)=='e')
                c++;
        }
        return c;
    }
}
