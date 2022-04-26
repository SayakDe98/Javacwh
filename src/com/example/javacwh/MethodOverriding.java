package com.example.javacwh;

class A
{
    public void method1()
    {
        System.out.println("this is method1 of class A");
    }
    public void method2()
    {
        System.out.println("this is method2 of class A");
    }
}

class B extends A
{
    @Override//this annotation is used to understand we are overriding a method
    public void method2()//we are overriding method2 of class A and access modifier,return type is same so is the method name and paramters.
    {
        System.out.println("this is method2 of class B");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        A obj1=new A();
        obj1.method2();

        B obj2=new B();
        obj2.method2();
    }
}
