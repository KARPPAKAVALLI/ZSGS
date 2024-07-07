package logic1;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int a=0;
        if(!isBirthday){
            if(speed<=60)
                a=0;
            else if(speed<=80)
                a=1;
            else
                a=2;
        }
        else{
            if(speed<=65)
                a=0;
            else if(speed<=85)
                a=1;
            else
                a=2;
        }
        return a;
    }
}
