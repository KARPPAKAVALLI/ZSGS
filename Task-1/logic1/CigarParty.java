package logic1;

public class CigarParty {
    public boolean cigarParty(int cigars, boolean isWeekend) {
        return cigars>=40 && (cigars<=60||isWeekend);
    }
}
