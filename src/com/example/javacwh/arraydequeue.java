package com.example.javacwh;
import java.util.*;
public class arraydequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);//insert at end of dequeue
        ad1.add(2);
        ad1.add(9);
        ad1.addFirst(10);
        ad1.addLast(20);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
        System.out.println();
       for(int i:ad1)
            System.out.println(i);

    }
}
