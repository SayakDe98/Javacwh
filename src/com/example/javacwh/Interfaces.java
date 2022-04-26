package com.example.javacwh;

abstract class Mobile//if we use interfaces then we have to implement each and every method of the interface
{
    int a=1;//in interfaces data types are final
    //int b;//they must be intiazied otherwise they throw error because they are final

    abstract public void switchOn();
    abstract public void call();

}

interface Camera
{
    void clickPhoto();
    void shootVideo();
}

interface GPS
{
    void showPosition();
}

class SmartPhone1 extends Mobile implements   Camera,GPS//we are making mobile an abstract class to show inheritance because SmartPhone is better version of mobile whereas we can use smartphone as a substitute for camera,videorecorder etc
{
    public void switchOn(){
        System.out.println("Turning on mobile");
    }
    public void call()
    {
        System.out.println("Calling Sabya");
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
}
public class Interfaces {
    public static void main(String[] args) {
        SmartPhone1 iphone=new SmartPhone1();
        iphone.switchOn();
        iphone.call();
        iphone.clickPhoto();
        iphone.shootVideo();
        iphone.showPosition();

        //iphone.a=10;//we can't change value of variable declared in interface
    }
}
