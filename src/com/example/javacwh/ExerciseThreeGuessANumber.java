package com.example.javacwh;

import java.util.Scanner;
import java.util.Random;
class Game
{
    private int noOfGuesses;
    private int Cpu;
    private int n;
   boolean check=false;
    public Game()
    {

        Random rand=new Random();
        Cpu=rand.nextInt(100);

    }

    public void takeUserInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess a number : ");
        n=sc.nextInt();
    }
    public boolean isCorrectNumber()
    {
      noOfGuesses++;
        if(n>Cpu){
            System.out.println("Your Guess is bigger than the number.Try Again!");
        }

        else if(n<Cpu)
        {
            System.out.println("Your Guess is smaller than the number.Try Again!");
        }
        else if(n==Cpu)
        {
            System.out.println("Correct Guess!");
            check=true;
        }
        else{ System.out.println("Invalid Number!Try Again!");
        }
        return check;

    }

    public void setNoOfGuesses()
    {
        noOfGuesses=0;
    }

    public int getNoOfGuesses()
    {
        return noOfGuesses;
    }
}
public class ExerciseThreeGuessANumber {
    public static void main(String[] args) {
       Game guess=new Game();

        guess.setNoOfGuesses();
        guess.takeUserInput();
        while(guess.isCorrectNumber()!=true)
            guess.takeUserInput();

        if(guess.check==true){
            System.out.println("Number of guesses : "+guess.getNoOfGuesses());
            }
    }
}
