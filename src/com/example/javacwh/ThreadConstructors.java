package com.example.javacwh;

class MyThr extends Thread
{
    public MyThr(String name) {
        super(name);
    }

        public void run()
        {
            System.out.println("This is a Thread");
        }

}
public class ThreadConstructors {
    public static void main(String[] args) {
        MyThr t1=new MyThr("Sayak");
        MyThr t2=new MyThr("Sayan");
        System.out.println(t1.getId());
        System.out.println(t1.getName());
        System.out.println(t2.getId());
        System.out.println(t2.getName());
    }
}
