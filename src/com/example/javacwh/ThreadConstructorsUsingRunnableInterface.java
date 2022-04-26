package com.example.javacwh;
///*
class MyThre1 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<40000;i++){
        System.out.println("This is thread 1");}
    }
}

class MyThre2 implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<40000;i++){
            System.out.println("This is thread 2");}
    }
}
public class ThreadConstructorsUsingRunnableInterface {
    public static void main(String[] args) {


      /*  MyThre t1 = new MyThre();
        Thread th1 = new Thread(t1, "Sayak");

        MyThre t2 = new MyThre();
        Thread th2 = new Thread(t2, "Sayan");

       //th1.start();
        System.out.println(th1.getId());
        System.out.println(th1.getName());
      //th2.start();
        System.out.println(th2.getId());
        System.out.println(th2.getName());
        */

       MyThre1 t1=new MyThre1();
       Thread th1=new Thread(t1,"sayak");

       MyThre2 t2=new MyThre2();
       Thread th2=new Thread(t2,"sayan");

       t1.run();
       t2.run();

        System.out.println("Name of thread 1 : "+th1.getName());
        System.out.println("Id of thread 1 : "+th1.getId());
        System.out.println("Name of thread 2 : "+th1.getName());
        System.out.println("Id of thread 2 : "+th1.getId());
    }
}
//*/