package logic1;

public class WithoutDoubles {
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if(noDoubles && die1==die2){
            die1++;
            if(die1>6)
                die1%=6;
        }
        return die1+die2;
    }
}
