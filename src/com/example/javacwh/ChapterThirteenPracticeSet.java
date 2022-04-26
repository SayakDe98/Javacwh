package com.example.javacwh;
//question 1
class GM extends Thread
{
    @Override
    public void run()
    {
        //question 2


        while(true) {
            //question 3
            try {
                Thread.sleep(200);

            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("good morning" + "Priority is set to : " + currentThread().getPriority());
        }
    }
}

class Welc extends Thread
{
    @Override
    public void run()
    {

        while(true)
        {
            try {
                Thread.sleep(200);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println("welcome"+"Priority is set to : "+currentThread().getPriority());
        }
    }
}


public class ChapterThirteenPracticeSet {
    public static void main(String[] args) {
    GM gm=new GM();
    Welc w=new Welc();

    //if priority was not set then priority is 5
   /*     gm.setPriority(9);
    gm.start();
    w.setPriority(6);
    w.start();


    */
        //question 4
        System.out.println(gm.getState());
        gm.start();
        System.out.println(gm.getState());
        System.out.println(w.getState());
        w.start();
        System.out.println(Thread.currentThread().getState());
    }
}
