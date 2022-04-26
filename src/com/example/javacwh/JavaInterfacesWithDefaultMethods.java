package com.example.javacwh;

interface MyCamera
{
    void snap();
    void recordVideo();
    private void greet()//we can use private access modifier and have a method body but we can't display this method directly but we can make use of a default method inside interface
    {
        System.out.println("Hello");
    }

    default void record4KVideo()//we can use default access modifier to have a body of method inside interface
    {
        greet();//we can print greet in this way only since it is private
        System.out.println("Recording Video in 4K...");
    }
}

interface MyWifi
{
    String[] availableNetworks();//creating an method of return type array of string
    void currentNetwork();
}

class MyPhone
{
    void call()
    {
        System.out.println("Calling...");
    }

    void receieveCall()
    {
        System.out.println("Connecting...");
    }
}

class SmartPhone2 extends MyPhone implements MyCamera,MyWifi //first we have to write extends then implements,doesn't work the other way
{
    @Override
    public void snap() {
        System.out.println("Taking a snap...");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording a video...");
    }
/*
    @Override
    public void record4KVideo() {//by doing this we can override the default method in interface MyCamera
        System.out.println("Recording 4K video...(this is inside SmartPhone2 class)");
    }*/

    @Override
    public String[] availableNetworks() {
        String [] networks={"vineet","Ag0","Saurav Jio"};
        return networks;
    }

    @Override
    public void currentNetwork() {
        System.out.println("Connecting to a network...");
    }
}
public class JavaInterfacesWithDefaultMethods {
    public static void main(String[] args) {
        SmartPhone2 onePlus=new SmartPhone2();
        String[]arr= onePlus.availableNetworks();
        onePlus.snap();
        onePlus.recordVideo();
        onePlus.record4KVideo();
        System.out.println("Available Networks : ");
        for(String element:arr) System.out.print(element+" ");
        System.out.println();
        onePlus.currentNetwork();
    }
}
