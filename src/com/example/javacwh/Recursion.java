package com.example.javacwh;

public class Recursion {
    static int factorial(int n)
    {
        if(n==0||n==1)return 1;
        else return n*factorial(n-1);
    }

    static int fibonacci(int n)
    {
        if(n <2)return 1;
        else return fibonacci(n-2)+fibonacci(n-1);
    }

    public static void main(String[] args) {
        int n=6;
        System.out.println("6! = "+factorial(n));
        System.out.println("Fibonacci of 6 terms = "+fibonacci(n));
    }
}
