package com.example.javacwh;

public class MethodOverloading {
 //arrays are called by reference because arrays are objects so the values of arrays actually change whereas data types like int ,float etc are called by value instead of call by reference so their values(arguments) are passed by values i.e. values are copied and the original values remain unchanged
/*
    static int change(int a)//we can also use void return type then also the value wont change for a
    {
        a=90;
        return a;
    }

    static void changearr(int [] arr)
    {
        arr[0]=102;
    }
  */
    static void foo()
    {
        System.out.println("good morning bro!");
    }

    /*static int foo()//gives error because even if we change return type then also it is not method overloading
    {
        return 1;
    }

     */

    static void foo(int a,int b)//this is possible since we are giving more/less parameters so we can overload a method
    {
        System.out.println("good morning "+a+", "+b+" "+"bro!");
    }

    static int foo(int a,int b,int c)//we can change return type and add/remove parameters to get an overloaded function too
    {
        System.out.println("good morning "+a+", "+b+", "+c+" bro!");
        return 1;
    }
 public static void main(String[] args) {
     /*   int a=11;
        change(a);
        System.out.println(a);//this value remains same

        int [] arr={42,22,33,44,55,101,2};
        changearr(arr);
        System.out.println(arr[0]);//this value changes cause array is object

      */
     foo();//we are not passing any arguments here
     foo(2,3);//we are passing arguments here
     foo(8,9,1);//we are passing more arguments here
     //Mnemonics:actual is arguments,means actual values are arguments
    }
}
