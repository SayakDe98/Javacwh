package com.example.javacwh;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [][] flats=new int[2][3];//declaring a multidimensional array and allocating it
        flats[0][0]=101;//assigning values to the array elements
        flats[0][1]=102;//assigning values to the array elements
        flats[0][2]=103;//assigning values to the array elements
        flats[1][0]=201;//assigning values to the array elements
        flats[1][1]=202;//assigning values to the array elements
        flats[1][2]=203;//assigning values to the array elements


      //  System.out.println("2D array printing:");
/*
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
                System.out.print(flats[i][j]+" ");

            System.out.println();
        }
  */
  /*      //we can also do the same using length
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
                System.out.print(flats[i][j]+" ");

            System.out.println();
        }
*/
        System.out.println("3D array:");

        int[][][] arr = new int[2][3][2];



    }
}
