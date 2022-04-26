package com.example.javacwh;
import java.util.Scanner;
import java.util.Random;
public class ExerciseTwoRockPaperScissors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your move (0 for Rock/1 for Paper/2 for Scissors): ");
        int move_number = sc.nextInt();


       /* if(move=="Rock")
            move_number=0;
        else if(move=="Paper")
            move_number=1;
        else if(move=="Scissors")
            move_number=2;
        /*
        else if(move!="Paper"||move!="Rock"||move!="Scissors"){

            System.out.println("Invalid input");
            System.exit(1);
        }
        */
        Random rand=new Random();
        int move_CPU=rand.nextInt(2);
        System.out.println("Cpu move : "+move_CPU);
        switch(move_number)
        {
            case 0->{if(move_CPU==0)
                System.out.println("Tie");else if(move_CPU==1) System.out.println("You lose");else System.out.println("You win");
            }
            case 1->{
                if(move_CPU==0) System.out.println("You win");else if(move_CPU==1) System.out.println("Tie");else
                    System.out.println("You lose");}
            case 2->{
                if(move_CPU==0) System.out.println("You lose");else if(move_CPU==1) System.out.println("You win");else
                    System.out.println("Tie");
            }
            default-> System.out.println("Invalid choice ");
            }
        }
}

