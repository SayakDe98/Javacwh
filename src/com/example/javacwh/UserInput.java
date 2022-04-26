package com.example.javacwh;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        System.out.println(i);
        System.out.println("Enter a value to check if it is integer or not");
        boolean b=sc.hasNextInt();//to check if the input is an integer input or not returns true if it is integer or else false
        System.out.println(b);
    }
}
