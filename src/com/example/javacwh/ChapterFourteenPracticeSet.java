package com.example.javacwh;

import java.util.Scanner;

class   MaxRetriesException extends Exception
        {
            @Override
        public String toString(){
        return "Maximum Number of Tries=5 , but you exceeded it.";
        }
        @Override
        public String getMessage()
        {
            return "Max tries =5";
        }
        }
class question3and4
{

   public  void index() throws MaxRetriesException
    {
        //WAP to keep accessing an array till we find a valid index if the no of tries exceed  then:print error

        int []arr={1,2,3,4,5,6};
        boolean flag=true;
        int tries=0;
        while(flag && tries<5) {


            try {
                System.out.println("Enter a valid index from 0 to 5");
                Scanner sc = new Scanner(System.in);
                int index = sc.nextInt();
                System.out.println(arr[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                tries++;
            }

            if(tries>=5)
            {
                throw new MaxRetriesException();
            }
        }

    }
}

public class ChapterFourteenPracticeSet {
    public static void main(String[] args) {
        /*
        //question 1
        //int a//this is a syntax error we didn't put a semicolon at the end of the line
        //a program to demonstrate logical error:multiply 2 and 3
        System.out.println((2+3));//instead of multiplying 2 and 3 we added them this is logical error
        //runtime error : we divide a number by 0
        System.out.println(5/0);

         */

/*        //question 2
        //WAP to print haha during ArithmeticException and hehe during IllegalArgumentException
        try
        {
            System.out.println("We are going to perform division operation between two numbers/operands");
            System.out.println("Enter a numerator : ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println("Enter a denominator : ");
            int d=sc.nextInt();
            int div=n/d;
            if(n<0||d<0)
                throw new IllegalArgumentException();
        }
        catch(ArithmeticException e)
        {
            System.out.println("haha");
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("hehe");
        }
        //check this question for illegalargumentexception
 */

        question3and4 q=new question3and4();
       try
       {
           q.index();
       }
       catch(Exception e)
       {
           System.out.println(e);
       }
    }
}
