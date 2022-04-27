//public class Employee{}//this gives error
//in a java program we can have only one public class
//Emp sayak=new Emp();//instanciating an object sayak of class Employee
package com.example.javacwh;


class Emp
{
    int id;
    String name;
    int salary;
    public void printDetails()
    {
        System.out.println("ID : "+id+" Name : "+name);
    }

    public int setSalary()
    {
        return salary;
    }
}
public class JavaClasses {
    public static void main(String[] args) {
        Emp sayak=new Emp();
        sayak.id=10;
        sayak.name="Sayak De";
        sayak.salary=50;
        sayak.printDetails();
        System.out.println("Salary:"+sayak.salary);
        Emp rohan =new Emp();
        rohan.id=12;
        rohan.name="Rohan Chowdhury";
        rohan.salary=20;
        rohan.printDetails();
        System.out.println("Salary:"+rohan.salary);
    }
}
