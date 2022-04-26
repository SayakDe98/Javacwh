package com.example.javacwh;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[3];
        arr[0]=10;
        arr[1]=20;
        arr[2]=45;
        boolean flag=true;
        while(flag)
        try {


        try
        {
            System.out.println("Enter the index of array:");
            int index=sc.nextInt();
            System.out.println("Enter the denominator: ");
            int den=sc.nextInt();
            System.out.println(arr[index]/den);
            flag=false;

        }
        catch(Exception e)
        {
            System.out.println("This is 2nd Level of try catch");
            System.out.println(e);
        }
        }
        catch(Exception e) {
            System.out.println("This is 1st Level of try catch");
        }
        System.out.println("Thanks for using this program");
    }
}

