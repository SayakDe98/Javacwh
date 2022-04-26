package com.example.javacwh;

public class FinallyKeyword {

    /*static int greet()
    {
        int a=4;
        int b=2;
        try{
            //without try block finally can't be used
            int c=a/b;
            return c;

        }
        catch (Exception e)
        {

        }
        finally
        {
            System.out.println("This will be displayed even though we used return statement above");
        }
        return -1;
    }

     */
/*
    static void loop()
    {
        int a=10;
        int b=5;
        while(true){
            try
            {
                System.out.println(a/b);

            }
            catch (Exception e)
            {
                System.out.println(e);
                break;
            }
            finally {
                System.out.println("This is inside finally block");
            }
            b--;
        }
    }

 */

    public static void main(String[] args) {
    //    greet();
      //  loop();
        System.out.println("finally can also be used with try only instead of with try-catch");
        int a=10,b=0;
        try
        {
            System.out.println(a/b);
        }
        finally
        {
            System.out.println("finally without using catch");
        }
    }
}
