package com.example.javacwh;

class Circle1 {
    public int radius;

    public Circle1(int radius) {
        this.radius = radius;
        System.out.println("This is in base class");
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder1 extends Circle1{
    public double volume;
    public int height;

    public Cylinder1(int radius,int height)
    {
        super(radius);
        this.radius=radius;
        this.height=height;
        System.out.println("This is in derived class");
    }
    public double area()
    {
        return 2*Math.PI*radius*(radius+height);
    }

    public double volume()
    {
        return Math.PI*radius*radius;
    }

    }


class Rectangle1
{
public int length;
public int breadth;

    public Rectangle1(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public double area()
    {
        return length*breadth;
    }
}

class Cuboid extends Rectangle1
{
    public int height;

    public Cuboid(int length,int breadth,int height)
    {
        super(length,breadth);
        this.length=length;
        this.breadth=breadth;
        this.height=height;

    }
    public double area()
    {
        return length*breadth;
    }

    public double volume()
    {
        return length*breadth*height;
    }
}

public class ChapterTenPracticeSet {
    public static void main(String[] args) {
        Cylinder1 candle=new Cylinder1(2,3);

        System.out.println( candle.area());
        System.out.println(candle.volume());


    }


}
