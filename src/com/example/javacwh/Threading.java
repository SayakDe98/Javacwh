package com.example.javacwh;
//Creating a thread class by extending the Thread class
class MyThread1 extends Thread//we need to inherit the contents of Thread class
{
    @Override
    public void run()//run function is present inside Thread and we override it to use Threads in our program
    {
    int i=0;
    while(i<40000)
    {
        System.out.println("Thread 1 is Running...cooking in progress...");
        i++;
    }
    }
}

class MyThread2 extends Thread
{
    @Override
    public void run()//run is one of the functions of Thread
    {
        for(int i=0;i<40000;i++)
            System.out.println("Thread 2 is Running...chatting in progress...");
    }
}

public class Threading
{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        //now we will do multithreading
        t1.start();//start is a function defined inside Thread class of java.lang package ,inside it public void run() i present
        t2.start();
    }
}
