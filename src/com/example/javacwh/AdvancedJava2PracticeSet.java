package com.example.javacwh;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class dummy
{
    @Deprecated
    public void dummy1()
    {
        System.out.println("dummy");
    }


}
interface myinterface
{
    void mymethod();
}
public class AdvancedJava2PracticeSet {
    @SuppressWarnings("deprecation")
    public static void main(String[] args)  {
        //q1.create javadoc using intellij and without it
        //q2.create a class with a method with deprecated annotation,what is the effect of this on program execution
        //dummy d=new dummy();
        //d.dummy1();//generates warning that method is deprecated
        //q3.supresswarnings to supress deprecation
        //q4.create an interface and generate an instance from it
        /*myinterface m=new myinterface()//an instance is created
        {
            @Override
            public void mymethod() {
                System.out.println("this is mymethod()");
            }
        };
         */
       /* System.out.println("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        File myfile=new File("multiplicationtable.txt");
        FileWriter fileWriter=new FileWriter("multiplicationtable.txt");
        String table="";
        for(int i=1;i<=10;i++)
        {
            table+=i+"X"+n+"="+(i*n);
            table+="\n";
        }
        fileWriter.write(table);
        fileWriter.close();

        */
        int n2=2;
        File myFile2=new File("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_2.txt");
        try {
            myFile2.createNewFile();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        String table2="";
        for(int i=1;i<=10;i++)
        {
            table2+=i+"X"+n2+"="+(i*n2);
            table2+="\n";
        }
        try
        {
            FileWriter fileWriter1=new FileWriter("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_2.txt");
            fileWriter1.write(table2);
            fileWriter1.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Could'nt be written to file");
        }int n3=3;
        File myFile3=new File("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_3.txt");
        try {
            myFile3.createNewFile();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        String table3="";
        for(int i=1;i<=10;i++)
        {
            table3+=i+"X"+n3+"="+(i*n3);
            table3+="\n";
        }
        try
        {
            FileWriter fileWriter3=new FileWriter("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_3.txt");
            fileWriter3.write(table3);
            fileWriter3.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Could'nt be written to file");
        }int n4=4;
        File myFile4=new File("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_4.txt");
        try {
            myFile4.createNewFile();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        String table4="";
        for(int i=1;i<=10;i++)
        {
            table4+=i+"X"+n4+"="+(i*n4);
            table4+="\n";
        }
        try
        {
            FileWriter fileWriter4=new FileWriter("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_4.txt");
            fileWriter4.write(table4);
            fileWriter4.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Could'nt be written to file");
        }int n5=5;
        File myFile5=new File("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_5.txt");
        try {
            myFile5.createNewFile();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        String table5="";
        for(int i=1;i<=10;i++)
        {
            table5+=i+"X"+n5+"="+(i*n5);
            table5+="\n";
        }
        try
        {
            FileWriter fileWriter5=new FileWriter("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_5.txt");
            fileWriter5.write(table5);
            fileWriter5.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Could'nt be written to file");
        }int n6=6;
        File myFile6=new File("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_6.txt");
        try {
            myFile6.createNewFile();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        String table6="";
        for(int i=1;i<=10;i++)
        {
            table6+=i+"X"+n6+"="+(i*n6);
            table6+="\n";
        }
        try
        {
            FileWriter fileWriter6=new FileWriter("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_6.txt");
            fileWriter6.write(table6);
            fileWriter6.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Could'nt be written to file");
        }int n7=7;
        File myFile7=new File("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_7.txt");
        try {
            myFile7.createNewFile();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        String table7="";
        for(int i=1;i<=10;i++)
        {
            table7+=i+"X"+n7+"="+(i*n7);
            table7+="\n";
        }
        try
        {
            FileWriter fileWriter7=new FileWriter("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_7.txt");
            fileWriter7.write(table7);
            fileWriter7.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Could'nt be written to file");
        }int n8=8;
        File myFile8=new File("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_8.txt");
        try {
            myFile8.createNewFile();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        String table8="";
        for(int i=1;i<=10;i++)
        {
            table8+=i+"X"+n8+"="+(i*n8);
            table8+="\n";
        }
        try
        {
            FileWriter fileWriter8=new FileWriter("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_8.txt");
            fileWriter8.write(table8);
            fileWriter8.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Could'nt be written to file");
        }int n9=9;
        File myFile9=new File("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_9.txt");
        try {
            myFile9.createNewFile();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        String table9="";
        for(int i=1;i<=10;i++)
        {
            table9+=i+"X"+n9+"="+(i*n9);
            table9+="\n";
        }
        try
        {
            FileWriter fileWriter9=new FileWriter("C:\\Users\\SAYAK\\Desktop\\MultiplicationTables\\multiplication_table_of_9.txt");
            fileWriter9.write(table9);
            fileWriter9.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Could'nt be written to file");
        }
    }
}
