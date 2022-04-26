package com.example.javacwh;

public class ErrorsInJava {
    public static void main(String[] args) {
        //Types of errors:
        //1.Syntax Error:
        //int a//no semicolon
        //b=10;//b is not declared
        //2.Logical Error:
        //we need to print from 1 to 10 all the prime numbers but we printed 9 as well so it is logical error and ide can't help us
        System.out.println(2);
        for(int i=1;i<5;i++)
        {
            System.out.println(2*i+1);
        }
        //3.Runtime Error:
        //user can input any thing which is not suitable and thus a runtime error will be there
        java.util.Scanner sc=new java.util.Scanner(System.in);
        int b=sc.nextInt();//if user inputs a long integer then its runtime error
        System.out.println("1000/b is : "+(1000/b));//if we input 0 then we get runtime error
    }
}
