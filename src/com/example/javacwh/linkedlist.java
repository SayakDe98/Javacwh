package com.example.javacwh;
//by using linkedlist we are doing generic programming in java as there is space for writing data type here we used Integer data type
import java.util.*;
//linkedlist has all methods of arraylist and few extra methods
//linkedlist can delete or insert elements faster than arraylist since there is next and previous node which can point to the required node
//but arraylist can access data faster than linkedlist
public class linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<Integer>();//inside the first bracket we have initial capacity of arraylist
        l1.add(5);
        l1.add(4);
        l1.add(10);
        l1.add(14);
        l1.add(50);
        l1.add(9);//we had initial capacity of 5 but we can add as much we want
        System.out.println("linkedlist 1:");
        for(int i=0;i<l1.size();i++)//we use size() method here instead of length which is used for array
        {
            System.out.println( l1.get(i));//this is used to get the ith element,we can't use l1[i] here as is used for array
        }
        LinkedList<Integer> l2=new LinkedList<Integer>();//we may even not specify the initial capacity in such case leave it blank
        l2.add(0,11);//we can add elements at any position
        l2.add(0,111);
        l2.add(1,56);
        System.out.println("linkedlist 2:");
        for(int i=0;i<l2.size();i++)//we use size() method here instead of length which is used for array
        {
            System.out.println(l2.get(i));//this is used to get the ith element,we can't use l2[i] here as is used for array
        }
        l1.addAll(l2);//we can even add a whole list into another list
        System.out.println("linked list 1 after adding linked list 2 to it");
        for(int i: l1)//we can also use for each loop here
        {
            System.out.println(i);//as we merged l2 into l1 so we can print l1 and get elements of both l1 and l2
        }

        l2.clear();//clears all elements of l2
        System.out.println("linkedlist2 after clearing it");
        for(int i: l2)//displaying empty arraylist
        {
            System.out.println(i);
        }
        System.out.println("element of linkedlist 1 at index 1:");
        System.out.println(l1.get(1));//displays element at index 1
        l1.remove(1);//used to remove element at index 1

        System.out.println("index of element 11 is at :"+l1.indexOf(11));
        System.out.println("Does l1 contain 111 : "+l1.contains(111));
        //below are few methods which are not present in arraylist:THIS IS BECAUSE LINKEDLIST IMPLEMENTS DEQUEUE(Double ended queue) WHEREAS ARRAYLIST DOESN'T
        l1.addLast(4);//add element to the last index
        System.out.println("displaying list l1 after adding 4 to the last index:");
        for(int i: l1)//we can also use for each loop here
        {
            System.out.print(i+"  ");//as we merged l2 into l1 so we can print l1 and get elements of both l1 and l2
        }
        System.out.println();
        l1.addFirst(2);
        System.out.println("displaying list l1 after adding 2 to the First index:");
        for(int i: l1)//we can also use for each loop here
        {
            System.out.print(i+"  ");//as we merged l2 into l1 so we can print l1 and get elements of both l1 and l2
        }
        System.out.println();
        l1.removeFirst();
        System.out.println("displaying list l1 after removing  the last index:");
        for(int i: l1)//we can also use for each loop here
        {
            System.out.print(i+"  ");//as we merged l2 into l1 so we can print l1 and get elements of both l1 and l2
        }
        System.out.println();
        l1.removeLast();
        System.out.println("displaying list l1 after removing  the last index:");
        for(int i: l1)//we can also use for each loop here
        {
            System.out.print(i+" ");//as we merged l2 into l1 so we can print l1 and get elements of both l1 and l2
        }
    }
}
