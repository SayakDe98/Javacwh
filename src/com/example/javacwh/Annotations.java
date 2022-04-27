package com.example.javacwh;

class KeyPadPhone
{

    public void sendMessage()
    {
        System.out.println("Message sent");
    }


}

class AndroidPhone extends KeyPadPhone
{
    @Override
    public void sendMessage()
    {
        System.out.println("Message sent via Whatsapp");
    }

@Deprecated
     void song()
    {
        System.out.println("Song is being played");
    }
}
@FunctionalInterface
interface MyFunctionalInterface
{
    void meth1();
    //void meth2();//there can be only 1 method in functional interface
}


public class Annotations {
    @SuppressWarnings("deprecation")
    public static void main(String[] args)
    {
        AndroidPhone ap=new AndroidPhone();
        ap.sendMessage();
        ap.song();
    }
}
