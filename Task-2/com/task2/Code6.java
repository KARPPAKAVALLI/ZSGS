package com.task2;

public class Code6 {
    //6) Evaluate the following expression on paper and on program and understand the difference
    //i)++a-b–  ii)a%b++  iii)a*=b+5   iv)x=69>>>2
    public static void main(String[] args) {
        int a=2,b=5;
        int x,y,z;
        x=++a-b--; // b--=> 5 ++a=>3 3-5=> -2
        System.out.println(x);
        a=2;b=5;
        y=a%b++; // b++=>5 a%5=> 2%5 => 2
        System.out.println(y);
        a=2;b=5;
        a*=b+5; // b+5 => 5+5 => 10  a*=10 => a=a*10 => 2*10 => 20
        System.out.println(a);
        z=69>>>2; // 1000101>>>2 = 0010001 (17)
        System.out.println(z);
    }
}
