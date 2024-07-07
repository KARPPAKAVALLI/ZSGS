package logic1;

public class LessBy10 {
    public boolean lessBy10(int a, int b, int c) {
        return (b-a>=10 || c-a>=10)||(a-b>=10 || c-b>=10)||(b-c>=10 || a-c>=10);
    }
}
