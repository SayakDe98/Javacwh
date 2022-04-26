package com.example.javacwh;

import java.util.Scanner;

class InvalidInputException extends Exception
{
    @Override
    public String toString()
    {
        return "Invalid Input operation";
    }
    @Override
    public String getMessage()
    {
        return "Input can't have 8 or 9";
    }
}


class DivideByZeroException extends Exception
{
    @Override
    public String toString()
    {
        return "Invalid input value";
    }
    @Override
    public String getMessage()
    {
        return "Cannot divide by Zero";
    }
}
class MaxInputException extends Exception
{
    @Override
    public String toString()
    {
        return "Input Out Of Range";
    }
    @Override
    public String getMessage()
    {
        return "Each Input should be less than 100000";
    }
}
class MaxMultiplierReachedException extends Exception
{
    @Override
    public String toString()
    {
        return "Input multiplier out of range";
    }
    @Override
    public String getMessage()
    {
        return "each input for multiplication operation should be less than 7000";
    }
}


class CustomCalculator
        {
    int input1,input2;

    public CustomCalculator(int input1, int input2) throws InvalidInputException,MaxInputException  {
       try
        {
            if(input1==8||input1==9||input2==8||input2==9)
            throw new InvalidInputException();
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.exit(1);
        }


        try{
            if(input1>=100000 || input2 >=100000 )
                throw new MaxInputException();
        }
        catch(Exception e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
            System.exit(1);
        }

        this.input1 = input1;
        this.input2 = input2;
    }

    public int addition()
    {
        int sum=0;
        sum=input1+input2;
        return sum;
    }public int subtraction()
    {
        int diff=0;
        diff=input1-input2;
        return diff;
    }public int multiplication() throws MaxMultiplierReachedException
    {

            try
            {
                if(input1>=7000||input2>=7000)
                {
                    throw new MaxMultiplierReachedException();
                }

            }
            catch(Exception e)
            {
                System.out.println(e);
                System.out.println(e.getMessage());
                System.exit(1);
            }

        int pdt=0;
        pdt=input1*input2;
        return pdt;
    }public int division() throws DivideByZeroException
        {
            try
            {
                if(input2==0)
                    throw new DivideByZeroException();
            }
            catch(Exception e)
            {
                System.out.println(e);
                System.out.println(e.getMessage());
                System.exit(1);
            }
        int div=0;
        div=input1/input2;
        return div;
    }
}
public class ExerciseSixCustomCalculator {
    public static void main(String[] args) throws InvalidInputException,MaxInputException,MaxMultiplierReachedException,DivideByZeroException{

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        CustomCalculator cc=new CustomCalculator(input1,input2);

        System.out.println("Enter an operation : ");
        System.out.println("+ for addition");
        System.out.println("- for subtraction");
        System.out.println("X for multiplication");
        System.out.println("/ for division");

        char ch=sc.next().charAt(0);
        switch(ch) {
            case '+' -> System.out.printf("Sum of %d and %d = %d",input1,input2,cc.addition());
            case '-' -> System.out.printf("Difference of %d from %d = %d",input1,input2,cc.subtraction());
            case 'X' -> System.out.printf("Product of %d and %d = %d",input1,input2,cc.multiplication());
            case '/' -> System.out.printf("Division of %d by %d = %d",input1,input2,cc.division());

        }


    }
}

