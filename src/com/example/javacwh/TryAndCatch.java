package com.example.javacwh;

public class TryAndCatch {
     public static void main(String[] args) {
          int a=999;
          int b=0;
          int c;
          //with try and catch block
         /* try
          {
               c=a/b;
               System.out.println("Value of c="+c);
          }
          catch(Exception e)
          {
               System.out.println("The program failed.Reason:");
               System.out.println(e);
          }
          System.out.println("End of program");

          */
          //without try and catch block
          System.out.println(a);//this gets printed because it is above the erreneous line
          c=a/b;
          System.out.println("Value of c="+c);//any line below the line from where exception generated is not executed ,if exception occurs interpreter exits the program
     }
}
