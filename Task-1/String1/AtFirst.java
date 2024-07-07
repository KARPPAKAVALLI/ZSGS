package String1;

public class AtFirst {
    public String atFirst(String str) {
        if(str.length()<2){
            while(str.length()<2)
                str+="@";
        }
        return str.substring(0,2);
    }
}
