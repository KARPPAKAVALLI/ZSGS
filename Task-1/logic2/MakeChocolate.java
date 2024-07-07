package logic2;

public class MakeChocolate {
    public int makeChocolate(int small, int big, int goal) {
        int rem=goal-big*5;

        if(big*5+small<goal||goal-((goal/5)*5)>small)
            return -1;

        if(rem<0 && goal%5<=small)
            return goal%5;

        else if(rem<=small)
            return rem;

        return -1;
    }
}
