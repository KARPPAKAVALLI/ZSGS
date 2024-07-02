public class LoneSum {
    public int loneSum(int a, int b, int c) {
        if(a!=b && b!=c && a!=c)
            return a+b+c;
        else if(a==b && b!=c)
            return c;
        else if(c==b && b!=a)
            return a;
        else if(a==c && b!=c)
            return b;
        else
            return 0;
    }
}
