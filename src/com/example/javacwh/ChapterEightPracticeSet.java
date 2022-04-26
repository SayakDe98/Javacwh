package com.example.javacwh;


class Employee

{
        int salary;
        String name;

        public int getSalary()
        {
            return salary;
        }

        public String getName()
        {
            return name;
        }

        public void setName(String n)
        {
            name=n;
        }


}


class Cellphone
{
    public void calling()
    {
        System.out.println("Calling...");
    }

    public void vibrating()
    {
        System.out.println("Vibrating...");
    }
    public void ringing()
    {
        System.out.println("Ringing...");
    }
}

class Square
{
    int side;
    public void setSide(int side)
    {
        this.side=side;
    }

    public void area()
    {
        System.out.println("Area of square of side "+side+" : "+side*side);
    }

    public void perimeter()
    {
        System.out.println("Perimeter of the same square : "+4*side);
    }
}

class Rectangle
{
    int length;
    int breadth;

    public void setSide(int l,int b)
    {
        length=l;
        breadth=b;

    }

    public void area()
    {
        System.out.println("Area of square of side : "+length*breadth);
    }

    public void perimeter()
    {
        System.out.println("Perimeter of the same square : "+(length+breadth));
    }
}

class Circle
{
    int radius;
    public void setRadius(int radius)
    {
        this.radius=radius;
    }

    public void area()
    {
        System.out.println("Area of square of side  : "+Math.PI*radius*radius);
    }

    public void perimeter()
    {
        System.out.println("Perimeter of the same square : "+2*Math.PI*radius);
    }
}

class TommyVecetti
{
    public void hit()
    {
        System.out.println("Hitting the enemy");
    }

    public void run()
    {
        System.out.println("Running from the enemy");
    }

    public void fire()
    {
        System.out.println("Firing on the enemy");
    }
}
public class ChapterEightPracticeSet {
    public static void main(String[] args) {
        /*Employee sayak=new Employee();



        sayak.salary=50;
        sayak.setName(" Sayak De");
        System.out.println(sayak.getSalary());
        System.out.println(sayak.getName());

        Employee sourav=new Employee();


        sourav.salary=30;
        sourav.setName(" Sourav Chaudhari");
        System.out.println(sourav.getSalary());
        System.out.println(sourav.getName());
         */

      /*  Cellphone cp=new Cellphone();
        cp.calling();
        cp.ringing();
        cp.vibrating();
*/

      /*  Square box=new Square();
        box.setSide(2);
        box.area();
        box.perimeter();
        */

       /* Rectangle rect=new Rectangle();
        rect.setSide(2,3);
        rect.area();
        rect.perimeter();
*/
        /*
        TommyVecetti player1 =new TommyVecetti();
        player1.fire();
        player1.hit();
        player1.run();
       */
        /*
        Circle round=new Circle();
        round.setRadius(4);
        round.area();
        round.perimeter();

         */
    }

}
