public class StrDist {
    public int strDist(String str, String sub) {
        if (str.length() < sub.length())
            return 0;
        if (str.startsWith(sub)) {
            int endIndex = str.indexOf(sub) + sub.length();
            int startIndex = str.lastIndexOf(sub);
            return startIndex - str.indexOf(sub) + sub.length();
        }
        else
            return strDist(str.substring(1), sub);
    }
}
