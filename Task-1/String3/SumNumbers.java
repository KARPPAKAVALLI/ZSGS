package String3;

public class SumNumbers {
    public int sumNumbers(String str) {
        String a="";
        int b=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
                a+=str.charAt(i);
            else{
                if(a!="")
                    b+=Integer.parseInt(a);
                a="";
            }
        }
        if(a!="")
            b+=Integer.parseInt(a);
        return b;
    }
}
