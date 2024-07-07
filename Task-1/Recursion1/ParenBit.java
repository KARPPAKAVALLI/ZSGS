package Recursion1;

public class ParenBit {
    public String parenBit(String str) {
        char a=str.charAt(0),b=str.charAt(str.length()-1);
        if(a=='(' && b!=')')
            return parenBit(str.substring(0,str.length()-1));
        if(a!='(' && b==')')
            return parenBit(str.substring(1));
        if(a!='(' && b!=')')
            return parenBit(str.substring(1,str.length()-1));
        return str;
    }
}
