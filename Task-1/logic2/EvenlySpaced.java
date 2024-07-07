package logic2;

public class EvenlySpaced {
    public boolean evenlySpaced(int a, int b, int c) {
        if(b<a){
            int t=a;
            a=b;
            b=t;
        }
        if(c<b){
            int t=c;
            c=b;
            b=t;
        }
        if(b<a){
            int t=a;
            a=b;
            b=t;
        }
        return b-a==c-b;
    }
}
