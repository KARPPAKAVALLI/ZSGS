public class StringX {
    public String stringX(String str) {
        String a="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='x'){
                if(i==0||i==str.length()-1)
                    a+=str.charAt(i);
            }
            else
                a+=str.charAt(i);
        }
        return a;
    }
}
