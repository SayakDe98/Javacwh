package com.example.javacwh;

class NegativeDimensionException extends Exception
{
    @Override
    public String toString()
    {
        return "Radius cannot be negative";
    }

    public String getMessage()
    {
        return "Radius cannot be negative";
    }

}
public class ThrowandThrowsKeyword {
    public static int divide(int a,int b) throws ArithmeticException//this means this method can throw an exception if errerneous input is given
    {
        int d=a/b;
        return d;
    }

    public static double areaOfCircle(int radius) throws NegativeDimensionException
    {
        if(radius<0)
        {
            throw new NegativeDimensionException();//exception has been thrown as radius is negative
        }
        double area=Math.PI*radius*radius;
        return area;
    }

    public static void main(String[] args) {

        try//there must be a try catch block for handling exception
        {
           // int result=divide(6,0);
           // System.out.println(result);

            double area=areaOfCircle(-1);
            System.out.println(area);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
