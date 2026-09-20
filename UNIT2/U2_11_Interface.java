//11. Write a java program to use Interface in java.

interface Animal
{
    void sound();
}

public class U2_11_Interface implements Animal
{
    public void sound()
    {
        System.out.println("Animal makes sound");
    }

    public static void main(String args[])
    {
        U2_11_Interface a = new U2_11_Interface();
        a.sound();
    }
}
