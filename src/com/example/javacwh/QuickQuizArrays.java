package com.example.javacwh;

public class QuickQuizArrays {
    public static void main(String[] args) {
        //WAP to display array in reverse order:
        float [] numbers={1.22f,2.45f,7.65f};
        System.out.println("Array numbers in reverse order:");
        for(int i=numbers.length-1;i>=0;i--) System.out.println(numbers[i]);//we are doing numbers.length-1 because array starts from 0 and ends at length-1 but length starts from 1 and ends at length
    }
}
