package String3;

public class NotReplace {
    public String notReplace(String str) {
        String a = new String();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            if (i + 2 <= len && str.substring(i, i + 2).equals("is")) {
                if ((i == 0 || !Character.isLetter(str.charAt(i - 1))) &&(i + 2 == len || !Character.isLetter(str.charAt(i + 2)))) {
                    a+="is not";
                    i++;
                }
                else {
                    a+="is";
                    i++;
                }
            }
            else {
                a+=str.charAt(i);
            }
        }
        return a;
    }
}
