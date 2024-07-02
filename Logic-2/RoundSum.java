public class RoundSum {
    public int roundSum(int a, int b, int c) {
        a=round10(a);
        b=round10(b);
        c=round10(c);
        return a+b+c;
    }
    public int round10(int num){
        if(num%10>=5)
            num=(num/10)*10+10;
        else
            num=(num/10)*10;
        return num;
    }
}
