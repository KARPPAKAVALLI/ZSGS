public class OneTwo {
    public String oneTwo(String str) {
        String a="";
        for (int i = 0; i + 2 < str.length(); i += 3) {
            a+=str.charAt(i + 1);
            a+=str.charAt(i + 2);
            a+=str.charAt(i);
        }
        return a;
    }
}
