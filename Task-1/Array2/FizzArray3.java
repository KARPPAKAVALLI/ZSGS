package Array2;

public class FizzArray3 {
    public int[] fizzArray3(int start, int end) {
        int a[]=new int[end-start];
        for(int i=start;i<end;i++)
            a[i-start]=i;
        return a;
    }
}
