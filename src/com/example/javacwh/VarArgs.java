package com.example.javacwh;

public class VarArgs {
    static int sum(int ...arr)
    {
        int result=0;
        for(int a:arr)
        {
            result+=a;
        }
        return result;
    }

    static int sum1(int a,int ...arr)
    {
        int result =a;
        for(int i:arr)
        {
            result+=i;
        }
        return result;
    }
    public static void main(String[] args) {
        //we can use VarArgs that is variable arguments when we want to pass different number of arguments and we don't want to waste time in overloading a function again and again
        System.out.println("Sum of nothing :"+sum());//not passing any arguments
        System.out.println("Sum of 1 : "+sum(1));
        System.out.println(("Sum of 1&2 : "+sum(1,2)));
        System.out.println("Sum of 1,2&3 : "+sum(1,2,3));
        //so we passed/used different number of arguments but we wrote only one function this saves our time we don't have to overload functions manually over and over again
        System.out.println("Sum of 1:"+sum1(1));//if we have to use this sum1 function then we have to atleast input one argument or else it will throw error
        //System.out.println("Sum of 3 :"=sum1());//this will throw error
    }
}
