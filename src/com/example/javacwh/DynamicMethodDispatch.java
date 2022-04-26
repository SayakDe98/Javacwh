package com.example.javacwh;

class Phone
{
    public void on()
    {
        System.out.println("Turning on Phone...");
    }

    public void keypad()
    {
        System.out.println("Access keypad!");
    }

    public void call()
    {
        System.out.println("Calling Akash");
    }
    public void off()
    {
        System.out.println("Shutting Down Phone...");
    }
}

class SmartPhone extends Phone
{
    public void on()
    {
        System.out.println("Turning on SmartPhone...");
    }
    public void call()
    {
        System.out.println("Calling Akash");
    }
    public void music()
    {
        System.out.println("Playing Despacito...");
    }
    public void off()
    {
        System.out.println("Shutting Down SmartPhone...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //Dynamic method dispatch does run time polymorphism we create object of SmartPhone during run time
        Phone obj=new SmartPhone();//this is dynamic method dispatch,we can use reference of base class and use object of sub class
        //SmartPhone obj1=new Phone();//this is not allowed
        obj.on();
        obj.keypad();
        obj.call();//overridden method
        //obj.music();//we can't do this because we can't play music on Phone but we can only in SmartPhone
        obj.off();//overridden method
    }
}
