package com.task2;

public class Code7 {
    //7) Evaluate the following expression on paper and on program and understand the
    //difference
    //a+=a++ + ++a + –a + a–; when a=28
    public static void main(String[] args) {
        int a=28;
        a+=a++ + ++a + --a + a--;
        // a++ = 28 (but 29)
        // a-- = 29 (but 28)
        // --a = 27
        // ++a = 28
        System.out.println(a);
    }
}
