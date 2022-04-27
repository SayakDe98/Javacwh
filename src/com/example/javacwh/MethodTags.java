package com.example.javacwh;

/**
 * This is a class where we understand abut method tags of java documentation
 */
public class MethodTags {
    /**
     *
     * @param args These arguments are supplied to the command line
     */
    public static void main(String[] args) {

        System.out.println("This is the main method");
    }

    /**
     *
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of i and j
     * @deprecated This method is obsolete use the + operator
     *@throws Exception when i==0
    */
    public int add(int i,int j)throws Exception
    {
        if(i==0)
            throw new Exception();
        int c=i+j;
        return c;
    }

}
