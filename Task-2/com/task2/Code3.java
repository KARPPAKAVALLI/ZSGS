package com.task2;

public class Code3 {
    //Write a program for the following. Let consider 20 students in a class with the roll no
    //101-120. We are going to split them into four groups. Based on their roll number we are
    //going to split them with the following logics.
    public static void main(String[] args) {
        int group1=101,group2=102,group3=103,group4=104;
        System.out.println("GROUP-1");
        while (group1<=120){
            System.out.println(group1);
            group1+=4;
        }
        System.out.println("GROUP-2");
        while (group2<=120){
            System.out.println(group2);
            group2+=4;
        }
        System.out.println("GROUP-3");
        while (group3<=120){
            System.out.println(group3);
            group3+=4;
        }
        System.out.println("GROUP-4");
        while (group4<=120){
            System.out.println(group4);
            group4+=4;
        }
    }
}
