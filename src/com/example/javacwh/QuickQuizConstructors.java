package com.example.javacwh;

class Employee1
{
    private int salary;
    public Employee1()
    {
        salary=10000;
    }

    public Employee1(int salary)
    {
        this.salary=salary;
    }

    public int getSalary()
    {
        return salary;
    }

}
public class QuickQuizConstructors {
    public static void main(String[] args) {
        //Employee1 sayak=new Employee1();
        Employee1 sayak=new Employee1(10000);
        System.out.println(sayak.getSalary());
    }
}
