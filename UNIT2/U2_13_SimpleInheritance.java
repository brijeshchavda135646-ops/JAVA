//13. Write a java program to perform simple inheritance.

class Parent
{
    void show()
    {
        System.out.println("This is Parent class");
    }
}

public class U2_13_SimpleInheritance extends Parent
{
    void display()
    {
        System.out.println("This is Child class");
    }

    public static void main(String args[])
    {
        U2_13_SimpleInheritance obj = new U2_13_SimpleInheritance();
        obj.show();
        obj.display();
    }
}
