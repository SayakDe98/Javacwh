package com.example.javacwh;

class Base
{
    public Base()
    {
        System.out.println("This is inside Base class constructor");
    }

    public Base(int x)
    {
        System.out.println("This is inside Base class constructor with value of x : "+x);
    }

}

class Derived extends Base
{
    public Derived()
    {
        System.out.println("This is inside Derived class constructor");
    }

    public Derived(int x,int y)
    {
        super(x);//this is used so that we call constructor of base class which has one parameter and the value of that parameter is recieved from x's value of this class
        System.out.println("This is inside Derived class constructor with value of y : "+y);
    }
}

class childOfDerived extends Derived
{
    public childOfDerived()
    {
        System.out.println("This is inside childOfDerived class constructor");
    }
    public childOfDerived(int x,int y,int z)
    {
        super(x,y);//we send x&y values to derived class from this class
        System.out.println("This is inside childOfDerived class constructor with value of z : "+z);
    }
}

public class ConstructorsInInheritance
{
    public static void main(String[] args) {
        childOfDerived obj=new childOfDerived(1,2,3);

    }
}
