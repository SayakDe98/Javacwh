package com.example.javacwh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingSpecificException {
    public static void main(String[] args) {

        int index;
        int [] arr={1,2,3};
        Scanner sc=new Scanner(System.in);
        try
        {

            System.out.println("Enter Index of array which will be numerator : ");
            index=sc.nextInt();//this must be inside the try block to catch InputMismatchException
            System.out.println("Enter the denominator : ");
            int denominator=sc.nextInt();//this must be inside the try block to catch InputMismatchException
            System.out.println(arr[index]/denominator);
        }
       catch(ArithmeticException e)
        {
            System.out.println("Arithmethic Exception");
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException Exception");
            System.out.println(e);
        }

         catch(Exception e)//to catch any other exception

        {
            System.out.println("Some other Exception");
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}
