package com.example.javacwh;

class Cylinder
{
    private int radius,height;

  /*Using getters and setters to initialize radius and height of cylinder
   public void setRadius(int r)
    {
        radius=r;
    }
    public int getRadius()
    {
        return radius;
    }

    public void setHeight(int h)
    {
        height=h;
    }

    public int getHeight()
    {
        return height;
    }
*/
    public Cylinder(int radius,int height)
    {
        this.radius=radius;
        this.height=height;
    }
    public float surfaceArea()
    {
        float surfaceArea=2*3.14f*radius*(radius+height);
        return surfaceArea;
    }

    public float volume()
    {
        float volume=3.14f*radius*radius*height;
        return volume;
    }


}

class Rect
{
    private int length,breadth;
    public Rect()
    {
        length=4;
        breadth=5;
    }

    public Rect(int l,int b)
    {
        length=l;
        breadth=b;
    }
}

class Sphere
{
    private int radius,height;

    /*Using getters and setters to initialize radius and height of cylinder
     public void setRadius(int r)
      {
          radius=r;
      }
      public int getRadius()
      {
          return radius;
      }

      public void setHeight(int h)
      {
          height=h;
      }

      public int getHeight()
      {
          return height;
      }
  */
    public Sphere(int radius,int height)
    {
        this.radius=radius;
        this.height=height;
    }
    public float surfaceArea()
    {
        float surfaceArea=4*3.14f*radius*radius;
        return surfaceArea;
    }

    public float volume()
    {
        float volume=4/3*3.14f*radius*radius*height;
        return volume;
    }


}
public class ChapterNinePracticeSet {
    public static void main(String[] args) {
       /* Cylinder tube=new Cylinder();
       tube.setRadius(3);
        tube.setHeight(4);*/

        Cylinder tube=new Cylinder(3,4);
        System.out.println(tube.surfaceArea());
        System.out.println(tube.volume());

        Rect box=new Rect();
        Rect box1=new Rect(4,5);

        Sphere ball=new Sphere(3,2);
        System.out.println(ball.surfaceArea());
        System.out.println(ball.volume());
    }
}
