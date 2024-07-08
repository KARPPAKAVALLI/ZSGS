package com.task2;

import java.util.Arrays;

public class Code30 {
    //30) Given a N*N square matrix, return an array of its anti-diagonals. Look at the example for more
    //details.
    //Example
    //Input:
    //1 2 3
    //4 5 6
    //7 8 9
    //Output : [
    //[1],
    //[2, 4],
    //[3, 5, 7],
    //[6, 8],
    //[9]
    //]
    public static void main(String[] args) {
        int a[][]={{1 ,2 ,3},{4 ,5 ,6},{7 ,8 ,9}};
        int row = a.length;
        int col = a[0].length;
        int pos=0;
        int ans[] = new int[row*col];
        int count = 0;
        for(int i=0;i<row;i++){
            pos = 0;
            for(int j=i;j>=0;j--){
                ans[count++] = a[pos][j];
                pos++;
            }
        }
        for(int i=1;i<row;i++){
            pos = i;
            for(int j=col-1;j>=i;j--){
                ans[count++] = a[pos][j];
                pos++;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
