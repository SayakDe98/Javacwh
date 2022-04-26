//take 5 subject's marks and find the percentage of student marks must beout of 100
package com.example.javacwh;
import java.util.Scanner;
public class ExerciseOneCbsePercentageCalculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks out of 100 for all the subjects below");
        System.out.println("Enter marks of subject 1 : ");
        byte a=sc.nextByte();
        System.out.println("Enter marks of subject 2 : ");
        byte b=sc.nextByte();
        System.out.println("Enter marks of subject 3 : ");
        byte c=sc.nextByte();
        System.out.println("Enter marks of subject 4 : ");
        byte d=sc.nextByte();
        System.out.println("Enter marks of subject 5 : ");
        byte e=sc.nextByte();
        float percentage=(a+b+c+d+e)/5.00f;//divide by .00f to get decimal if the inputs were non float
        System.out.println("The percentage of the student is : ");
        System.out.println(percentage);
    }
}
