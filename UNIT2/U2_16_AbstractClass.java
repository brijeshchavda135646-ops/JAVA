//16. Write a java program to use Abstract class.

abstract class Shape
{
    abstract void draw();

    void show()
    {
        System.out.println("This is abstract class");
    }
}

public class U2_16_AbstractClass extends Shape
{
    void draw()
    {
        System.out.println("Drawing Shape");
    }

    public static void main(String args[])
    {
        U2_16_AbstractClass obj = new U2_16_AbstractClass();
        obj.show();
        obj.draw();
    }
}
