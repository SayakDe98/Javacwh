package com.example.javacwh;

public class AccessModifiers {

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
        AccessModifiers obj=new AccessModifiers();
        obj.setId(2);
        System.out.println(obj.getId());
        obj.setName("Sayak");
        System.out.println(obj.getName());
    }
}
