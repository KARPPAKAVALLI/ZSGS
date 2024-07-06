public class SumDigits {
    public int sumDigits(String str) {
        int a=0;
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)))
                a+=str.charAt(i)-'1'+1;
        }
        return a;
    }
}
