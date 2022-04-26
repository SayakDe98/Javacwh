package com.example.javacwh;
//three ways to include Scanner class:
//1.by importing every class inside package
import java.util.*;//includes all classes inside package java.util;

//2.by importing only one class which is required
import java.util.Scanner;

//3. by directly accessing when creating objects by providing whole path

public class Packages {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);//use this for 1&2nd ways
        java.util.Scanner sc= new java.util.Scanner(System.in);//if we do this we don't need to import any package and class(do this when using 3rd way)
    }
}
