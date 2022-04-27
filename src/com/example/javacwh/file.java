package com.example.javacwh;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class file  {
    public static void main(String[] args) {

        File myFile=new File("File.txt");//creating an object myFile from class File
      /*  //1.create a new file
        try {
            myFile.createNewFile();//creates a NewFile we needed to use throws IOException or use try catch like we did here
            System.out.println("File created successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }


        //2.write to a file
        try {
            FileWriter fileWriter=new FileWriter("File.txt");//we could also just throws IOException
            fileWriter.write("Hi, I am Sayak \n How are you");
            fileWriter.close();//we have to close the filewriter everytime we write to a file or else it won't get written
            System.out.println("Wrote to file successfully");

        } catch (IOException e) {
            System.out.println("Some error occured while writing to the file");
        }



        //3.read from a file
        //import FileNotFoundException

        try {
            Scanner sc=new Scanner(myFile);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }sc.close();
        } catch (FileNotFoundException e) {
           e.printStackTrace();
            System.out.println("Some error occured while writing from file");
        }


        //4.delete a file
        if(myFile.delete())
            System.out.println(myFile.getName()+" was successfully deleted");
        else System.out.println("Some error occured");


*/



    }
}
