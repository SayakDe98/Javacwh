package com.example.javacwh;

interface Parent
{
    void meth1();
    void meth2();
}

interface Child extends Parent//if we use implements here for interfacce Child then we need to make body of methods in Child present in Parent ,otherwise make extends Parent.if we make class Child then we can only do implements and not extends
{
    void meth3();
    void meth4();
}

class GrandChild implements Child{//we have done implements here means we have to make body of methds of above parent and child class
    public void meth1()//we have to use public because it is a class
    {
        System.out.println("Method 1");
    }

    public void meth2()
    {
        System.out.println("Method 2");
    }
    public void meth3()
    {
        System.out.println("Method 3");
    }
    public void meth4()
    {
        System.out.println("Method 4");
    }
}


public class InheritanceInInterfaces {
    public static void main(String[] args) {
        GrandChild gc=new GrandChild();
        gc.meth1();
        gc.meth2();
        gc.meth3();
        gc.meth4();
    }
}
