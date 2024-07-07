package com.Array1;

public class Start1 {
    public int start1(int[] a, int[] b) {
        int c=0;
        if(a.length>=1 && a[0]==1) c++;
        if(b.length>=1 && b[0]==1) c++;
        return c;
    }
}
