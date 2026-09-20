//17. Write a java program to use interface.

interface Vehicle
{
    void run();
}

public class U2_17_Interface implements Vehicle
{
    public void run()
    {
        System.out.println("Vehicle is running");
    }

    public static void main(String args[])
    {
        U2_17_Interface obj = new U2_17_Interface();
        obj.run();
    }
}
