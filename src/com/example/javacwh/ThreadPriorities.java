package com.example.javacwh;

class MyThre extends Thread
{
    public MyThre(String name)
    {
        super(name);
    }
    @Override
    public void run()
    {
        System.out.println("Name of this thread : "+getName()+" priority of this thread : "+getPriority());
    }
}

public class ThreadPriorities {
    public static void main(String[] args) {
    MyThre t1=new MyThre("Sayak");
    MyThre t2=new MyThre("Sayan");
    MyThre t3=new MyThre("Sourav");
    MyThre t4=new MyThre("Sabyasachi");
    MyThre t5=new MyThre("Diptajit");

    t1.setPriority(Thread.MAX_PRIORITY);
    t2.setPriority(Thread.MIN_PRIORITY);
    t3.setPriority(Thread.MIN_PRIORITY);
    t4.setPriority(Thread.MIN_PRIORITY);
    t5.setPriority(Thread.MIN_PRIORITY);
    t1.run();
    t2.run();
    t3.run();
    t4.run();
    t5.run();

    }
}
