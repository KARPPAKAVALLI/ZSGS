public class LastChars {
    public String lastChars(String a, String b) {
        if(a=="")
            a="@";
        if(b=="")
            b="@";
        return a.charAt(0)+""+b.charAt(b.length()-1);
    }
}
