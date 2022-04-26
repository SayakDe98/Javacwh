package com.example.javacwh;
//Creating thread using Runnable interface
//this is second way of creating thread
class MyThread3 implements Runnable//using runnable interface by implementing it
{
    @Override
    public void run()
    {
     //   System.out.println();//we can use Ctrl+d to copy lines
       // System.out.println();//we can use Ctrl+d to copy lines
        for(int i=0;i<40000;i++)
        {
            System.out.println("This is first thread...watching movie in progress");
        }
    }
}

class MyThread4 implements Runnable
{
    @Override
    public void run()
    {
        for(int i=0;i<40000;i++)
        {
            System.out.println("This is second thread...eating food in progress");
        }
    }
}

public class ThreadUsingRunnableInterface
{
    public static void main(String[] args)
    {
        MyThread3 bullet1 =new MyThread3();
        Thread gun1=new Thread(bullet1);
        MyThread4 bullet2=new MyThread4();
        Thread gun2=new Thread(bullet2);
        //now we will do multithreading
        gun1.start();//we can't directly use start function we have to make an object of Thread also then we can use
        gun2.start();
    }
}
