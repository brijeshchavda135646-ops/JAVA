//12. Write a java program to extend one interface into another interface.

interface A
{
    void show();
}

interface B extends A
{
    void display();
}

public class U2_12_ExtendInterface implements B
{
    public void show()
    {
        System.out.println("This is Interface A");
    }

    public void display()
    {
        System.out.println("This is Interface B");
    }

    public static void main(String args[])
    {
        U2_12_ExtendInterface obj = new U2_12_ExtendInterface();
        obj.show();
        obj.display();
    }
}
