package com.example.javacwh;

class Animal
{
    String sound;

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}

class Dog extends Animal
{
  int legs;

    public int getLegs() {
        return legs;
    }

    public void setLegs() {
        legs = 4;
    }
}
public class QuickQuizInheritance {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.setSound("Animal sound");
        System.out.println(a.getSound());
        //a.getLegs();//this is not possible we can't use object of base class to invoke derived class methods/data members
        Dog johnny=new Dog();
        johnny.setSound("Bhow Bhow");//we can invoke/call base class methods or daata members from derived class
        System.out.println(johnny.getSound());
        johnny.setLegs();
        System.out.println(johnny.getLegs());
    }
}
