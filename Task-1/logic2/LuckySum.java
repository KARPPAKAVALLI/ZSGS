package logic2;

public class LuckySum {
    public int luckySum(int a, int b, int c) {
        int x=a+b+c;
        if(a==13){
            x=0;
        }
        else if(b==13){
            x-=b;
            x-=c;
        }
        else if(c==13){
            x-=c;
        }
        return x;
    }
}
