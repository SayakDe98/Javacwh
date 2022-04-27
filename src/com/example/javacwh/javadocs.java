package com.example.javacwh;
/**
*This is demonstration of java docs and how it is used in industry
* This is an <i>italic</i> word,<p>and this is in new paragraph</p>
* @author SayakDe98
* @version 1.0
* @since 2022
* @see <a href ="https://docs.oracle.com/en/java/javase/15/docs/api/index.html" target="_blank">Java Docs</a>
 */

//comments are always written below package and above class(es)
    //a is anchor tag,href is the link ,the first line contains description,i is for italic p is for new paragraph,after doing any changes regenerate javadoc to see changes,
// target="_blank" means opens link in new tab
    // slash single star is for multiline comment,slash double star is a javaoc comment

public class javadocs {
    public static int add(int a,int b)
    {
        int sum=0;
        sum=a+b;
        return sum;
    }
    public static void main(String[] args) {

        System.out.println("This is main method");
        System.out.println("Sum of 1 & 2 : "+add(1,2));
    }
}
