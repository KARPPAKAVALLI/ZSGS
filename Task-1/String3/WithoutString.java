package String3;

public class WithoutString {
    public String withoutString(String base, String remove) {
        int i=0;
        String a="";
        while(i<base.length()){
            if(i+remove.length() <= base.length() &&
                    base.substring(i,i+remove.length()).equalsIgnoreCase(remove))
                i+=remove.length();
            else{
                a+=base.charAt(i);
                i++;
            }
        }
        return a;
    }
}
