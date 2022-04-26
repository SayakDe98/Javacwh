package com.example.javacwh;

import java.util.Scanner;

public class ChapterSixPracticeSet {
    public static void main(String[] args) {

        //create an array of 5 floats and show their sum
        /*
        float [] var=new float[5];
        var[0]=1.1f;
        var[1]=2.2f;
        var[2]=3.3f;
        var[3]=4.4f;
        var[4]=5.5f;
        float sum=0.0f;
        for(float i:var)
        {
            sum+=i;
        }
        System.out.println("Sum = "+sum);

         */

        //create an array and find if a value is present in the array:
       /*
        int []arr={10,20,30,40,50};
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to be found out :");
        n=sc.nextInt();
        int f=0;//we can also use boolean instead of integer data type
        for(int i:arr)
        {
            if(i==n){ System.out.println("Number is present in the array");f=1;break;}//if we used boolean then make f=true
        }
        if(f==0) System.out.println("Number is not present in the array");
*/      //we are given marks of n=5 students we need to find out the average marks of the given marks
  /*      int [] physicsMarks={98,97,100,92,89};//assuming total number of students=5
         int sum=0;
        for(int i:physicsMarks) sum+=i;
        System.out.println("Average = "+sum/5.0);//type casts to double
        */
        //WAP to add two arrays of dimension 2X3
   /*

         int matrix1[][]={{1,2,3},{4,5,6}};
        int matrix2[][]=new int[2][3];


        matrix2[0][0]=1;matrix2[0][1]=2;matrix2[0][2]=3;
        matrix2[1][0]=4;matrix2[1][1]=5;matrix2[1][2]=6;

        int matrixSum[][]=new int[2][3];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                matrixSum[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        System.out.println("The summation of matrix1 and amtrix2 is : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(matrixSum[i][j]+" ");
            }
            System.out.println();
        }

    */
        //WAP to reverse an array
       /*
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter total number of elements of array:");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("Enter elements of the array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array in reversed order:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");;
        }
*/
        //Alternate way to reverse a string by swapping:
/*       int [] arr={1,2,44,11,23,55};
        int l=arr.length;
        int n=Math.floorDiv( l , 2);
        int temp;
        for(int i=0;i<n;i++)
        {
            //initially lets say we have two numbers:a=1,b=2
            //  a    b    temp
            // |1|   |2|   ||
            // |1|    |2|  |1|
            // |2|    |2|   |1|
            // |1|    |2|    |1|
            temp=arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1]=temp;
        }

        for(int i:arr)
            System.out.print(i+" ");
*/
        //WAP to find maximum element in the array
     /*   int []arr={-91,2,3000,540};
        int max=arr[0];//alternatively we can also do int max=Integer.MIN_VALUE;
        for(int i:arr)
        {
            if(i>max)
                max=i;
        }

        System.out.println("Max = "+max);
       */

        //WAP to find minimum element in the array
/*
        int []arr={91,-200,3000,54};
        int min=arr[0];//we can also do int min=INTEGER.MAX_VALUE;
        for(int i:arr)
        {
            if(i<min)
                min=i;
        }
        System.out.println("Min = "+min);
 */
        //WAP to check if the array is sorted or not:
 /*      int [] arr={11,22,81,820,90};//an unsorted array
        boolean isSorted=true;//assuming array is sorted and if it is not sorted we need to prove that by traversiving through loop
        for(int i=0;i<arr.length-1;i++)//length-1 because we annot compare the right element of last element
        {
            if(arr[i]>arr[i+1])
            {
                isSorted=false;
                System.out.println("Array is not sorted");
                break;
            }
        }
        if(isSorted==true) System.out.println("Array is sorted");

     */
    }


}
