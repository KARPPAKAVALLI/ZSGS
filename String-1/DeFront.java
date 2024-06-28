public class DeFront {
    public String deFront(String str) {
        if(str.charAt(0)!='a'&&str.charAt(1)!='b')
            str=str.substring(2);
        else if(str.charAt(0)=='a'&& str.charAt(1)!='b')
            str='a'+str.substring(2);
        else if(str.charAt(0)!='a'&& str.charAt(1)=='b')
            str=str.substring(1);
        return str;
    }

}
