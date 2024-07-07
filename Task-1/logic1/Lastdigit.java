package logic1;

class Lastdigit {
    public boolean lastDigit(int a, int b, int c) {
        return a%10==b%10||a%10==c%10||c%10==b%10;
    }
}
