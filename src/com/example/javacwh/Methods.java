package com.example.javacwh;

public class Methods {

static int logic(int x,int y)
{
    int z;
    if(x>y) z=x-y;
    else z=x+y;
    return z;
}

public void display(int f)
{
    System.out.println(f);
}
    public static void main(String[] args) {
        int a=1,b=2;
        int c;
        c=logic(a,b);//we don't need objects to call/invoke a static method,static function is associated with class instead of object of class
        Methods obj=new Methods();
        obj.display(c);//we need to create objects to call/invoke a non static method from a static method
        int d=2,e=1;
        int c1=logic(d,e);
        obj.display(c1);

    }
}
