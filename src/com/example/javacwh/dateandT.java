package com.example.javacwh;
//the objects in dateandtime class are immutable unlike the previous abstract class  calendar and its concrete subclass GregorianCalendar
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class dateandT {
    public static void main(String[] args) {

        LocalTime l=LocalTime.now();
        System.out.println(l);
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);//nanoseconds gives great precision

    }
}
