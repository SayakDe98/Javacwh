package com.example.javacwh;

public class StringMethods {
    public static void main(String[] args) {
        //in camel case if we need to type toLowerCase we just need to write tlc and we will get it in intellij ide similar for tuc fortoUpperCase
    //String is immutable so if we define a string then it wont change even if some string method is used on it,the string method will point to another string after the operation is performed
        /*String nontrimmedstring="     kjkjkj     ";
        System.out.println(nontrimmedstring);
        System.out.println(nontrimmedstring.trim());//removes leading and ending spaces
 */
        String name="Sayak";
        //note:index start from 0
        System.out.println(name.substring(2));//returns value from index 2
        System.out.println(name.substring(2,4));//returns value from index 2 to 4 excluding 4that is from 2 to (4-1),if we specify upto 5 then we get full string from 2 to 4
        System.out.println(name.replace('a','s'));//replace all oldChar(a) with newChar(s)
        System.out.println(name.replace("yak","sad"));//replace one part of string with other
        System.out.println(name.replace("a","ier"));//replace a char(string) with another string
        System.out.println(name.startsWith("Sa"));
        System.out.println(name.endsWith("k"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf("Say"));//returns the first occurence index of the substring
        System.out.println(name.indexOf("a",2));//searches substring from index 2
        System.out.println(name.lastIndexOf("a"));
        System.out.println(name.lastIndexOf("S",0));
        System.out.println(name.equals("Sayak"));
        System.out.println(name.equalsIgnoreCase("SAYAK"));
    }

}
