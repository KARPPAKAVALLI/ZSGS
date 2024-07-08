package com.task2;

public class Code13 {
    //13) Java Program to print the smallest element in an array
    public static void main(String[] args) {
        int [] a={13,65,98,20,0,-1};
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i])
                min=a[i];
        }
        System.out.println(min);
    }
}
