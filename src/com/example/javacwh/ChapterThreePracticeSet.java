package com.example.javacwh;

public class ChapterThreePracticeSet {
    public static void main(String[] args) {
        //a java program to convert a string into lowercase
       /* String s="HellO";
        System.out.println(s.toLowerCase());
        */
        //a java program to replace spaces with underscore
     /*   String s1="hi this is a string";
     s1=s1.replace(" ","_");
        System.out.println(s1);
    */
        //replace a substring with another
       /* String s3="Dear <|name|>, thanks a lot";
        s3=s3.replace("<|name|>","Sayak");
        System.out.println(s3);
        */
/*
        //detect double and triple spaces in string
        String s4="This string contains  double and   triple spaces";
        System.out.println(s4.indexOf("  "));//if return -1 means s4 has no double space
        System.out.println(s4.indexOf("   "));//if return -1 means s4 hass no triple space
        */
        //make in letter format
        String s5="Dear Sayak,\n\tThis java course if fine.\n Thanks";//we used escape sequence to make this in letter format
        System.out.println(s5);
    }
}