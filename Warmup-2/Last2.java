public class Last2 {
    public int last2(String s) {
        if(s.length()<2)
            return 0;
        int c=0;
        String a=s.substring(s.length()-2);
        for(int i=0;i<s.length()-2;i++){
            if(s.substring(i,i+2).equals(a))
                c++;
        }
        return c;
    }
}
