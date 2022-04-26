package com.example.javacwh;

public class ArraysExtension {
    public static void main(String[] args) {
        //we can use array of int,char,String,float,etc
        int[]marks={11,22,33,28,45,98};
        float [] numbers={1.22f,2.45f,7.65f};
        char [] c={'c','a','b'};
        String [] name={"Sayak","Rohan","Akash","Sourav"};

        //we can display array by three ways:
        //1.by using naive approach:
        System.out.println("Naive approach:");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        //2.using for loop:
        System.out.println("for loop:");
        for(int i=0;i<marks.length;i++) System.out.println(marks[i]);//if we want the value of i as well then we use this loop instead of for-each loop

        //3.using for-each loop
        System.out.println("for-each loop");
        for(int i:marks) System.out.println(i);
    }
}
