package com.example.javacwh;
import java.util.Scanner;
public class ChapterSevenPracticeSet {
    static void multiplication(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    static void pattern1(int n)
    {
        for(int i=1;i<=4;i++)//rows
        {
            for(int j=1;j<=i;j++)//stars
                System.out.print("*");

            System.out.println();
        }
    }
    static int sumRecursion(int n){
        if(n==1)return 1;//Base condition to stop recursion,if base condition not present then recursion happens infinitely
        else return n+sumRecursion(n-1);
    }
    static int fibonacci(int n)
    {
        if(n <=2)return 1;//base condition,nth term was mentioned so assume first element is 1,if index was used then start from 0,for index condition is if(n<2)return 1;
        else return fibonacci(n-2)+fibonacci(n-1);
    }

    static float average(int ...arr)
    {
        float sum=0;
        for(int i:arr)
            sum+=i;
        float avg=sum/arr.length;
        return avg;
    }

    static void patternTwoRecursion(int n)
    {
        if(n>0)//base condition n==0
        {

            for(int i=n;i>0;i--)
            {
                System.out.print("*");
            }
            System.out.println();
            patternTwoRecursion(n-1);
        }
    }
    static void patternOneRecursion(int n)
    {
        if(n>0)//base condition is n==0
        {
            patternOneRecursion(n-1);
            for(int i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static float convertToFarenheit(int c)
    {
         float f=1.8f*c+32;
        return f;
    }

    static int sumIterative(int n)
    {
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        sum+=i;
    }
        return sum;
    }

    public static void main(String[] args) {

        /*WAP to print a multiplication table of number n
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to get its multiplication table:");
        int n=sc.nextInt();
        multiplication(n);


        */

        /*WAP to print pattern:
        *
        **
        ***
        ****

        int n=4;
        pattern1(n);



         */

        /* WAP to print first n natural numbers



        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms upto which we want natural numbers");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) System.out.print(i+" ");

         */
        /*WAP to write a recursive function to calculate sum of first  n natural numbers


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms upto which we want natural numbers");
        int n=sc.nextInt();
        System.out.println("Sum of first "+n+" natural numbers is : "+sumRecursion(n));

         */

        /*WAP to print the following pattern:
        ****
        ***
        **
        *



        for(int i=1;i<=4;i++)//rows
        {
            for(int j=5-i;j>=1;j--)//stars
            {  System.out.print("*");}

            System.out.println();
        }

         */
       /*WAP to print nth term of fibonacci series using recursion:
            int n=6;
            System.out.println("Fibonacci of 6 terms = "+fibonacci(n));
        */
/*WAP to find average of set of  numbers by passing as parameters

        System.out.println("Average of 1,2,3 :"+average(1,2,3));

 */
        /* WAP to print the pattern2 below using recursion:
        ****
        ***
        **
        *

         */
      //  int n=4;
        //patternTwoRecursion(n);

        /*WAP to print below pattern1 using recursion:
        *
        **
        ***
        ****
         */
        //int n=4;
        //patternOneRecursion(n);

        ///*Write a function to convert celcius to farenheit
        // int celcius=26;
        //System.out.println(convertToFarenheit(celcius));
        // */

        /*WAP to print sum of first n natural number using iterative approach


        int n=10;
        System.out.println("Sum of first "+n+"Natural numbers is : "+sumIterative(n));

         */
    }
}
