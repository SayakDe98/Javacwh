package com.example.javacwh;

import java.util.Scanner;

class MyException1 extends Exception{
    @Override
    public String toString()
    {
        return "toString()";
    }
    public String getMessage()
    {
        return "getMessage()";
    }
}

class MaxAgeException extends Exception//custom exception to tell max age can be 125
{
    @Override
    public String toString()
    {
        return "You have entered invalid age";
    }

    @Override
    public String getMessage()
    {
        return "Maximum age can be 125";
    }
}
public class ExceptionClass{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    /*
    int a=sc.nextInt();
    if(a>5)
    {
        try
        {
            throw new MyException1();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();//prints the line at which exception occurs this doesn't end the program execution although the way it displays error seems so
            System.out.println(e);//does same thing as  System.out.println(e.toString());
        }
    }
    */

        System.out.println("Enter age : ");
        int age=sc.nextInt();
        if(age>125)
        {
            try
            {
                throw new MaxAgeException();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println(e.getMessage());
            }

        }
        System.out.println("End of program");
    }
}
