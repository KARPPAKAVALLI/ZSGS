public class FrontBack {
    public String frontBack(String str) {
        if(str.length()>1){
            str=str.charAt(str.length()-1)+str.substring(1,str.length()-1)+str.charAt(0);
        }
        return str;
    }
}
