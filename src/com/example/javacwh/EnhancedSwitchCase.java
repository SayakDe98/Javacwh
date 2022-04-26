package com.example.javacwh;
import java.util.Scanner;
public class EnhancedSwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int var=sc.nextInt();
        System.out.println("Lets see enhnced switch which doesnt need break statements");
        switch(var)
        {
            case 1 ->System.out.println("This is case 1");
            case 2-> System.out.println("This is case 2");
            case 3->{
                System.out.println("This is case 3");
                System.out.println("we can also use enhanced switch for multiple statements in switch");
            }
            default->
                System.out.println("This is default case");
        }
    }
}
