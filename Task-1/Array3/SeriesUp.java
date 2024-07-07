package Array3;

public class SeriesUp {
    public int[] seriesUp(int n) {
        int a[]=new int[n*(n + 1)/2];
        int j=0;
        for(int i=1;i<=n;i++){
            for(int k=1;k<i+1;k++){
                a[j++]=k;
            }
        }
        return a;
    }
}
