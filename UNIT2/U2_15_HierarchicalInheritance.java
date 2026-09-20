//15. Write a java program to use Hierarchical inheritance.

class Parent2
{
    void show()
    {
        System.out.println("Parent class");
    }
}

class Child1 extends Parent2
{
    void display1()
    {
        System.out.println("Child 1");
    }
}

class Child2 extends Parent2
{
    void display2()
    {
        System.out.println("Child 2");
    }
}

public class U2_15_HierarchicalInheritance
{
    public static void main(String args[])
    {
        Child1 obj1 = new Child1();
        Child2 obj2 = new Child2();

        obj1.show();
        obj1.display1();

        obj2.show();
        obj2.display2();
    }
}
