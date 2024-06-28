public class Front22 {
    public String front22(String str) {
        String a="";
        if(str.length()>=2)
            a=str.charAt(0)+""+str.charAt(1);
        else
            a=str;
        return a+str+a;
    }
}
