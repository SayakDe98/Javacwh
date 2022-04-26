package com.example.javacwh;

import java.util.Scanner;

public class ChapterFivePracticeSet {
    public static void main(String[] args) {

        /*Print the following pattern:
          ****
          ***
          **
          *


        for(int i=4;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");//inner loop to print stars
            }
            System.out.print("\n");//outer loop to iterate the rows
        }

         */
/*
        //WAP to sum first n natural even numbers using while loop note:0 is not natural number,if it was asked whole numbers then include 0
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n to print out the sum of first n even natural numbers : ");
        int n=sc.nextInt();

        int sum=0;
        int i=1;//if we were asked whole numbers then start with i=0
        while(i<=n) {sum+=2*i;i++;}//if we were asked whole numbers condition statement of loop should be: i<n
        System.out.println("Sum = "+sum);

 */

     /*
        //WAP to print the multiplication table of number n we are making multiplication table from 1 X n to 10 X n
        System.out.println("Enter a number for which we will print the multiplication table : ");

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        System.out.println("Multiplication Table : ");

        for(int i=1;i<=10;i++) System.out.println(i+" X "+n+" = "+i*n);
*/
/*
        //WAP to find out the multiplication table of 10 in reverse order
        //lets use do-while loop
        int index=10;

        System.out.println("Multiplication Table : ");
        do {
            System.out.println(index+" X "+10+" = "+index*10);
            index--;
        }while(index>=1);
*/
      /*
        //WAP to find out the factorial of number using for loop

        System.out.println("Enter the number for which we need to find out the factorial : ");

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int f=1;

        for(int i=1;i<=n;i++)f*=i;
        System.out.println("Factorial of "+n+" = "+f);
*/
/*
        //WAP to find out the factorial of number using while loop
        System.out.println("Enter the number for which we need to find out the factorial : ");

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int f=1;
        int i=1;
        while(i<=n)
        {
            f*=i;
            i++;
        }
        System.out.println("Factorial of "+n+" = "+f);
*/
        /*
        //WAP to print the below pattern using while loop:
         ****
         ***
         **
         *


        int i=4;
        while(i>=1)
        {
            int j=i;
            while(j>=1)
            {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }
*/
        //What can be done by using one loop can also be done using another loop?Answer=true

       /*
        //WAP to find out the sum of the numbers which are generated in the multiplication table of 8

        System.out.println("Multiplication Table : ");
        int sum=0;//initializing sum with 1
        for(int i=1;i<=10;i++){ System.out.printf("%d X %d = %d \n",i,8,i*8);sum+=i*8;}
        System.out.println("Sum = "+sum);
*/
        //A do-while loop is executed atleast once

/*        //WAP to sum first n natural even numbers using for loop
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of n to print out the sum of first n even natural numbers : ");
        int n=sc.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++){sum+=2*i;}
        System.out.println("Sum = "+sum);
*/
    }
}
