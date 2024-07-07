package Recursion1;

public class NestParen {
    public boolean nestParen(String str) {
        if(str.length()==0)
            return true;
        char a=str.charAt(0),b=str.charAt(str.length()-1);
        if(a=='(' && b==')')
            return nestParen(str.substring(1,str.length()-1));
        else
            return false;
    }
}
