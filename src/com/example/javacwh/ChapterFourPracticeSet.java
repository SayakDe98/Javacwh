package com.example.javacwh;
import java.util.Scanner;
public class ChapterFourPracticeSet {
    public static void main(String[] args) {
        //in first program we have to use relational operator == instead of assignment operator as if condition,the correct syntax is:
       /* int a=10;
        if(a==11) System.out.println("I am 11");else System.out.println("I am not 11"); */

        //wap to check whether a student is pass or fail if it reuires total 40% and each subject 33% in each subject assume 3 subjects for each students as an input

        Scanner sc=new Scanner(System.in);

/*
        System.out.println("Enter marks of subject 1 : ");
        byte m1=sc.nextByte();
        System.out.println("Enter marks of subject 2 : ");
        byte m2=sc.nextByte();
        System.out.println("Enter marks of subject 3 : ");
        byte m3=sc.nextByte();
        float total=(m1+m2+m3)/3.0f;
        if(m1>=33 && m2 >=33 && m3>=33 && total >=40 ) System.out.println("You have passed");else System.out.println("You failed!");*/

     /*
        //Income slab       Tax %
        //  2.5L - 5L       5%
        //5L - 10L          20%
        //Above 10L         30%
        //Note there is no tax below 2.5L


        System.out.println("Enter your income in Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);
        */

        /*
        //day 1->monday,day2->tuesday and so on
        System.out.println("Enter the day number : ");
        int n=sc.nextInt();

        switch(n)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
           // case 4-> System.out.println("Thursday");//we cant use enhanced switch and switch togeher in one switch
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day choice");
        }
        */
        //we can also do by using enhanced switch case

     /*   System.out.println("Enter day number : ");
        int day=sc.nextInt();

        switch(day)
        {
            case 1-> System.out.println("Monday");
            case 2-> System.out.println("Tuesday");
            case 3-> System.out.println("Wednesday");
            case 4-> System.out.println("Thursday");
            case 5-> System.out.println("Friday");
            case 6-> System.out.println("Saturday");
            case 7-> System.out.println("Sunday");
            default-> System.out.println("Invalid day choice");
        }
*/
    /*
        //WAP to check whether a year is leap or not
        System.out.println("Enter year to check whether it is leap or non leap : ");
        int year=sc.nextInt();
        if(year%100==0&&year%400==0||year%100!=0&&year%4==0) System.out.println("This is a leap year");else System.out.println("This is a non leap year");
        */

     //Wap to check whether a website is commercial website(.com) or indian website(.in) or organizational website(.org)
        System.out.println("Enter the url : ");
        String url=sc.nextLine();
        if(url.endsWith(".com"))System.out.println("This is a commercial website");else if(url.endsWith(".in")) System.out.println("This is an Indian website");else if(url.endsWith(".org"))System.out.println("This is an organzational website");
    }
}
