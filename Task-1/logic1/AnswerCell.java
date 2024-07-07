package logic1;

public class AnswerCell {
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if(isAsleep)
            return false;
        else
            return (isMorning && isMom)||(!isMorning);
    }
}
