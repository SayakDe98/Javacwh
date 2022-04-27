package com.example.javacwh;
@FunctionalInterface
interface Vehicle//we can also use non functional interface
{
    void honk();
}
/*
//we can use another class to implement the interface but it is making our code bigger
class Car implements Vehicle{
    @Override
    public void honk() {
        System.out.println("Peep Peep");
    }
}
 */
//so let's use anonymous class by which we don't need this class ,if we use anonymous class we can create exactly one object and the anonymous class is a class without a name

//method3 by extending a class by using anonymous class
abstract class Exercise
{
    abstract void run();
}

//Lambda expressions are similar to methods but they don't need a name
@FunctionalInterface
interface LambExp//we cannot anything other than use functional interface,even if we don't mention functionalinterface then also we can have only one method inside this to make lambda expression
{
    void meth1(int a,int b);
}
public class AnonymousClassAndLambdaExpressions {
    public static  void main(String[] args) {
//method1 using another class and creating its object
        //        Car c=new Car();
//        c.honk();
        //method2 creating anonymous class
       /* Vehicle v=new Vehicle() {
            @Override
            public void honk() {
                System.out.println("Peep Peep");
            }
        };
        v.honk();*/
//method3 by extending a class
//        Exercise e=new Exercise() {
//            @Override
//            void run() {
//                System.out.println("Running 2 laps...");
//            }
//        };
//        e.run();

        //lambda expressions:
        LambExp obj =(a,b)->{
            System.out.println("The value of a and b is : "+ a + "," + b);
        };
        obj.meth1(5,10);




    }
}
