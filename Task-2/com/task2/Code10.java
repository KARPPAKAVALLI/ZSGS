package com.task2;

public class Code10 {
    //10) Using Recursion, reverse the string such as
    //Eg 1:  Input: one two three
    //       Output: three two one
    //Eg 2:  Input: I love india
    //       Output: india love I
    public static String rev(String s){
        int spaceIndex = s.lastIndexOf(" ");
        if(spaceIndex==-1) { // no space => only one word (first word)
            return s;
        }
        //s.substring(spaceIndex+1) => the last word + space + rev(s.substring(0,spaceIndex)) => recursion call to get the remaining words
        return s.substring(spaceIndex+1) + " " + rev(s.substring(0,spaceIndex));
    }

    public static void main(String[] args) {
        System.out.println(rev("one two three"));
        System.out.println(rev("I love india"));
    }
}
