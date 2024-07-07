package Warmup1;

public class IntMax {
    public int intMax(int a, int b, int c) {
        int max=a;
        if(b>a && b>c)
            max=b;
        else if(c>b && c>a)
            max=c;
        return max;
    }
}
