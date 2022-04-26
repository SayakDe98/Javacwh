package com.example.javacwh;

public class Constructors {
    public Constructors()//gets invoked automatically when object is created
    {
        id=22;

        name="Your Name";

    }
    public Constructors(int id,String myName)//we can make multiple constructors in a java program as many we want
    {

        this.id=id;

        name=myName;
    }
    private int id;
    private String name;

    public void setId(int i)
    {
        this.id=i;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String n)
    {
        name=n;
    }

    public String getName()
    {
        return name;
    }

    public static void main(String[] args) {

        //Constructors obj=new Constructors();
        Constructors obj=new Constructors(20,"Sayak De");
        //obj.setId(2);
       System.out.println(obj.getId());
        //obj.setName("Sayak");
        System.out.println(obj.getName());
    }
}
