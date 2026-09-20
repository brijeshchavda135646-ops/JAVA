//20. Write a java program to perform overriding of abstract class.

abstract class Animal2
{
    abstract void sound();
}

public class U2_20_AbstractOverriding extends Animal2
{
    void sound()
    {
        System.out.println("Dog makes sound");
    }

    public static void main(String args[])
    {
        U2_20_AbstractOverriding obj = new U2_20_AbstractOverriding();
        obj.sound();
    }
}
