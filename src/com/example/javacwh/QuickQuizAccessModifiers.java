//create a java class to set value of perimeter and area of circle but if it is set wrong according to radius then display an error
package com.example.javacwh;
import java.util.Scanner;
class MyCircle
{
    private int radius;
    private float area;
    private float perimeter;

    public void getRadius(int radius)
    {
        this.radius=radius;
    }

    public float CalcArea()
    {
        area=3.14f*radius*radius;
        return area;
    }
    public float CalcPerimeter()
    {
        perimeter=2*3.14f*radius;
        return perimeter;
    }

    public float getArea(float a)
    {
           return a;
    }
    public float getPerimeter(float p)
    {
        return p;
    }
}
public class QuickQuizAccessModifiers {
    public static void main(String[] args) {
        MyCircle obj=new MyCircle();
        obj.getRadius(3);
        System.out.println("The radius of the circle is set to 3.Take Pie=3.14");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the area of circle to check if you solved it correctly :");
        float a=sc.nextFloat();
        System.out.println("Enter the perimeter of circle to check if you solved it correctly :");
        float p=sc.nextFloat();
        System.out.println(obj.CalcArea());
        if(obj.getArea(a)== obj.CalcArea()) System.out.println("You figured out the area correctly!");
        else if(obj.getArea(a)!=obj.CalcArea()) System.out.println("You didn't find the correct area of the circle");
        if(obj.getPerimeter(p)== obj.CalcPerimeter()) System.out.println("You figured out the perimeter correctly!");
        else if(obj.getPerimeter(p)!=obj.CalcPerimeter()) System.out.println("You didn't find the correct perimeter of the circle");

    }
}
