//19. Write a java program to use method overriding.

class Parent3
{
    void show()
    {
        System.out.println("Parent show method");
    }
}

public class U2_19_MethodOverriding extends Parent3
{
    void show()
    {
        System.out.println("Child show method");
    }

    public static void main(String args[])
    {
        U2_19_MethodOverriding obj = new U2_19_MethodOverriding();
        obj.show();
    }
}
