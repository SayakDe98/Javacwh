package com.example.javacwh;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class calendar {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone().getID());
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR)+":"+(c.get(Calendar.SECOND)));
        GregorianCalendar g=new GregorianCalendar();
        System.out.println(g.isLeapYear(2019));
        System.out.println(TimeZone.getAvailableIDs()[0]);
    }
}
