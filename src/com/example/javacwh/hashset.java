package com.example.javacwh;

import java.util.HashSet;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> myHashSet=new HashSet<>(5,0.5f);
        //load factor is the factor with which the capatcity of hashmap inceases
        myHashSet.add(1);
        myHashSet.add(12);
        myHashSet.add(13);
        myHashSet.add(15);
        myHashSet.add(10);
        System.out.println(myHashSet);//see we didn't use a loop to iterate a hash set,hence we take less time complexity

    }
}
