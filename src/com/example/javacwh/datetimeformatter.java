package com.example.javacwh;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class datetimeformatter {
    public static void main(String[] args) {
        //first find the localdatetime now
        LocalDateTime dt=LocalDateTime.now();
        //then use the datetimeformatter to display date and time of your suitable choice
        DateTimeFormatter df=DateTimeFormatter.ofPattern("dd/MM/yyyy E hh:mm a");//E is for name of day,a is for am/pm,M is for month,m is for minutes

        //store the formatted datetime in a string
        String myDate=dt.format(df);

        //print the formatted date time
        System.out.println(myDate);

        //we can also try out some inbuild format of date like iso_date
        DateTimeFormatter df1=DateTimeFormatter.ISO_DATE;
        System.out.println(dt.format(df1));


    }
}
