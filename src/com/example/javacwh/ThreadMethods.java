package com.example.javacwh;

import java.io.*;
import java.lang.Thread;
/*

class MyThreOne extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<2;i++)
        {
            System.out.println("Thread 1 is running");

        }
    }
}

class MyThreadOne extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<2;i++)
        {
            System.out.println("Thread 1 is running");
        }
    }
}

class MyThreTwo extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while(i<56)
        {
            System.out.println("Thread 2 is running");
        }
    }
}

 */

class MyT extends Thread
{
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Child Thread is running...");
                Thread.sleep(3000);//puts into sleep for 3 sec
            }
        }
        catch(InterruptedException e)
        {
            System.out.println("Child Thread is interrupted");
        }
        System.out.println("Thread is running");
    }
}


public class ThreadMethods {
    public static void main(String[] args) {
/*        MyThreOne t1=new MyThreOne();
        MyThreTwo t2=new MyThreTwo();

 */

 /*       try
        {
            for(int i=0;i<5;i++)
            {
                Thread.sleep(5000);//puts the main function to sleep for 5 sec
                System.out.println("HI");//this gets printed after 5 sec as the main function was sleeping for 5 sec
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

*/
        /*t1.start();
        try
        {
            t1.join();//this method is used to execute t1 only , after t1 is finished we start with next thread
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        t2.start();

         */

        MyT t=new MyT();
        t.start();
        t.interrupt();
        System.out.println("Main Thread");
    }
}
