package com.example.javacwh;

/*
class Phone3
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
interface Camera3
{
    void clickPhoto();
    void shootVideo();
}

interface GPS3
{
    void showPosition();
}


class SmartPhone3 extends Phone implements Camera3,GPS3
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
    public void switchOn(){
        System.out.println("Turning on mobile");
    }

    @Override
    public void clickPhoto() {
        System.out.println("Clicking Photo");
    }
    public void shootVideo(){
        System.out.println("Recording Video");
    }

    public void showPosition()
    {
        System.out.println("Location : Howrah");
    }
    public void off()
    {
        System.out.println("Shutting Down SmartPhone...");
    }
}

public class PolymorphismInInterfaces  {
    public static void main(String[] args) {
        //Dynamic method dispatch does run time polymorphism we create object of SmartPhone during run time
        Camera3 cam=new SmartPhone3();//this is dynamic method dispatch,we can use reference of base class and use object of sub class
        //SmartPhone3 obj1=new Phone();//this is not allowed
        //as we are using reference of camera hence we cannot use other features of SmartPhone,we can only use the features of camera
        //cam.on();//we cant use this cause it is not a feature of camera
        //cam.keypad();//we cant use this cause it is not a feature of camera
        //cam.call();//overridden method,we cant use this cause it is not a feature of camera
        //obj.music();//we can't do this because we can't play music on Phone but we can only in SmartPhone
        //cam.off();//overridden method,we cant use this cause it is not a feature of camera
        cam.clickPhoto();//we can use this
        cam.shootVideo();//we can use this
    }
}

*/