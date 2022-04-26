package com.example.javacwh;

public class Arrays {
    //arrays are not data types they are objects in java
    //why do we use arrays:we can access arrays very easily by using indices
    public static void main(String[] args) {
        //to store name of 500 students of a stream we can :
        //1.Make 500 variables
        //2.use arrays

        //Three ways to declare ,initialize,memory allocate for arrays:
        //1.declare and memory allocation
        int [] marks=new int[5];//marks is the reference and new int[5] is memory allocation done by object the object is array
      //we allocated 5 memory locations in the marks array
       marks[0]=100;//we assigned marks=100 for index 0
        marks[1]=60;
        marks[2]=90;//we are setting value of array marks
        marks[3]=86;
        marks[4]=10;
        for (int index:marks) {
            System.out.println(index);
        }
        //we can also declare using:
        //2.Declaration then memory allocation
        int [] arr;//declaration of reference of array arr
        arr=new int[5];//memory allocation of array arr of integer type

        //3.we can declare ,memory allocation and initialization together using below:
        int [] array={10,20,60,70,40};//we don't need to type size here ,Java automatically finds its size

        System.out.println();
        System.out.println(array[4]);

        //we mainly use method 2&3
        //if we want to change the values again and again use 2
        //if we want to set the values first then change or not change then use method 3
    }
}
