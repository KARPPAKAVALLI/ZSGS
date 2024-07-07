package logic2;

public class Blackjack {
    public int blackjack(int a, int b) {
        if(a>21 && b>21)
            return 0;
        else if(a>21)
            return b;
        else if(b>21)
            return a;
        else
            return Math.abs(a-21)<Math.abs(b-21)?a:b;
    }
}
