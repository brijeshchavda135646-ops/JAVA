//14. Write a java program to use multilevel inheritance.

class A
{
    void show()
    {
        System.out.println("Class A");
    }
}

class B extends A
{
    void display()
    {
        System.out.println("Class B");
    }
}

public class U2_14_MultilevelInheritance extends B
{
    void print()
    {
        System.out.println("Class C");
    }

    public static void main(String args[])
    {
        U2_14_MultilevelInheritance obj = new U2_14_MultilevelInheritance();
        obj.show();
        obj.display();
        obj.print();
    }
}
