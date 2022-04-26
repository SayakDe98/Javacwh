package com.example.javacwh;

import java.time.LocalTime;
import java.util.ArrayList;

import java.util.Date;

import java.util.Calendar;

import java.time.LocalTime;

import java.time.format.DateTimeFormatter;

import java.util.HashSet;

public class ChapterFifteenPracticeSet {
    public static void main(String[] args) {
       /*
        //problem 1
        //creating an arraylist
        ArrayList<String> names = new ArrayList<>();

        //adding 10 names:
        names.add("Ram");
        names.add("Shyam");
        names.add("Akash");
        names.add("Sourav");
        names.add("Sam");
        names.add("Raju");
        names.add("Bunty");
        names.add("Rohan");
        names.add("Prateek");
        names.add("Mohit");
      //  System.out.println(names);
        //printing using for-each loop
        for(String i:names) System.out.println(i);

        */
/*
        //problem 2

        Date d=new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

 */
        /*
        //problem 3
        Calendar c=Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));

         */
/*
        //problem 4
        LocalTime l=LocalTime.now();
        DateTimeFormatter df=DateTimeFormatter.ofPattern("HH:mm:ss");//capital H gives 24 hr format
        String time=l.format(df);
        System.out.println(time);

 */
        /*
        //problem 5
        HashSet<Integer> h=new HashSet<>();
        h.add(1);
        h.add(1);
        System.out.println(h);//we added two 1's but only one instance gets printed since hashset stores values uniquely

         */

    }
}
