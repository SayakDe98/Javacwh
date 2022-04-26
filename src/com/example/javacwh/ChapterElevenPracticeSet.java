package com.example.javacwh;

abstract class Pen
{
    abstract public void write();
    abstract public void refill();
}

class FountainPen extends Pen
{

    public void write(){
        System.out.println("Writing using Pen");
    }
    public void refill(){
        System.out.println("Using refill");
    }
   void changeNib()
   {
       System.out.println("Changning nib");
   }

}

class Monkey
{
    void jump(){
        System.out.println("starts jumping...");
    };
    void bite(){
        System.out.println(" starts biting...");
    };
}

interface BasicAnimal
{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal
{
    @Override
    public void eat()
    {
        System.out.println("Starts eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeps zzz");
    }
    void speak()
    {
        System.out.println("Speaks");
    }


}

abstract class Telephone
{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();
}

class Smartphone4 extends Telephone
{
    public void ring()
    {
        System.out.println("ringing...");
    }
    public void lift()
    {
        System.out.println("lifting...");
    }
    public void disconnect()
    {
        System.out.println("disconnecting...");
    }

}

interface TvRemote
{
    void changeChannel();
    void increaseVolume();
}
interface SmartTvRemote extends TvRemote
{
    void useYoutube();
    void useNetflix();
}
class Tv implements TvRemote,SmartTvRemote
{

    @Override
    public void changeChannel() {
        System.out.println("changing channel...");
    }

    @Override
    public void increaseVolume() {
        System.out.println("increasing volume...");
    }

    @Override
    public void useYoutube() {
        System.out.println("using youtube...");
    }

    @Override
    public void useNetflix() {
        System.out.println("using netflix...");
    }
}

public class ChapterElevenPracticeSet {
    public static void main(String[] args) {
        //demonstrating polymorphism of phone
      /*  Smartphone4 sp4=new Smartphone4();
        sp4.ring();
        sp4.lift();
        sp4.disconnect();
*/
       /*
         Monkey mo=new Human();
        mo.bite();
        mo.jump();
        //mo.sleep();//not possible
        //mo.speak();//not possible
        */
        Tv tv=new Tv();
        tv.changeChannel();
        tv.increaseVolume();
        tv.useNetflix();
        tv.useYoutube();

    }
}
