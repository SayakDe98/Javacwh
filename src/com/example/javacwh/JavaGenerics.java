package com.example.javacwh;

import java.util.ArrayList;
import java.util.Scanner;

//let's see how generics work
class generics<T1,T2>
{
    int val;
    private T1 t1;//T1 is class of type T1 ,T1 can be any type depending on what we supply to the class
    private T2 t2;//T2 is class of type T2 ,T2 can be any type depending on what we supply to the class

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public generics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

}

public class JavaGenerics {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();//without supplying a class to the arraylist
        //we can use any data type
        arrayList.add(3);
        arrayList.add(3.0f);
        arrayList.add(3.05);
        arrayList.add("sayak");
        arrayList.add('c');
        arrayList.add(new Scanner(System.in));
        //but we need to do type casting
        //int a=arrayList.get(0);//throws an error if type casting not done
        int a1=(int)arrayList.get(0);//throws an error if type casting not done
        //float f=(float)arrayList.get(0);//gives compile time error which is difficult to figure out for a programmer
        //but if we specify the class type by using generics then we don't need to do type casting
        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(12);
        arrayList1.add(13);
        arrayList1.add(14);
        arrayList1.add(15);
        arrayList1.add(16);
        int b=arrayList1.get(0);//shows no error
        int c=arrayList1.get(1);//shows no error
        int d=arrayList1.get(2);//shows no error
        int e=arrayList1.get(3);//shows no error

        generics<Integer,String> g=new generics(1,3,"sayak");//we can supply any class like Integer,String,Float,etc to the already defined classes like class generics
        System.out.println(g.getT1()+" "+g.getT2());
    }
}
