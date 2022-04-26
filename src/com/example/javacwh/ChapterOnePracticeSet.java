package com.example.javacwh;
import java.sql.SQLOutput;
import java.util.Scanner;
public class ChapterOnePracticeSet {

    static int Sum(int a,int b,int c)
    { //a program to sum three numbers
        int sum=a+b+c;
        return sum;
    }



    static double Miles(float kilometers)
    {//kilometers to miles
        double miles=0.621731*kilometers;
        return miles;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter three numbers : ");
        /*byte a=sc.nextByte();
        byte b=sc.nextByte();
        byte c=sc.nextByte();
        System.out.println("Sum of the three numbers is: "+Sum(a,b,c));
*/
       /* System.out.println("Enter marks of the student for 3 subjects to find out cgpa : ");
        float m1=sc.nextFloat();
        float m2=sc.nextFloat();
        float m3= sc.nextFloat();
        float cgpa=(m1+m2+m3)/30;
        System.out.println("The CGPA of the student is : "+cgpa);
*/
/*
        //program to greet a person :
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello "+name+" have a good day!");
*/
/*        System.out.println("Enter distance in kilometers : ");
        float kilometers=sc.nextFloat();
        System.out.println("Equivalent Distance in Miles : "+Miles(kilometers));
*/
        //program to check if input is integer or not
        System.out.println("Provide an input to check if it is integer input or not : ");
        boolean z=sc.hasNextInt();
        System.out.println(z);
    }
}
