package String3;

public class sameEnds {
    public String sameEnds(String str) {
        int len = str.length();
        String result = "";
        for (int i = 0; i <= len / 2; i++) {
            String start = str.substring(0, i);
            String end = str.substring(len - i);
            if (start.equals(end))
                result = start;
        }
        return result;
    }
}
