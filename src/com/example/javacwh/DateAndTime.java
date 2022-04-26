package com.example.javacwh;

public class DateAndTime {
    public static void main(String[] args) {
        System.out.println("Time passed from 1970 till now in milliseconds : "+System.currentTimeMillis());
        System.out.println("Time passed from 1970 till now in seconds : "+System.currentTimeMillis()/1000);
        System.out.println("Time passed from 1970 till now in minutes : "+System.currentTimeMillis()/1000/60);
        System.out.println("Time passed from 1970 till now in hours : "+System.currentTimeMillis()/1000/60/60);
        System.out.println("Time passed from 1970 till now in days : "+System.currentTimeMillis()/1000/60/60/24);
        System.out.println("Time passed from 1970 till now in months(approx assuming 30 days a month) : "+System.currentTimeMillis()/1000/60/60/24/30);
        System.out.println("Time passed from 1970 till now in years : "+System.currentTimeMillis()/1000/60/60/24/365);
        long ms=System.currentTimeMillis();
        System.out.println(ms);



    }
}
