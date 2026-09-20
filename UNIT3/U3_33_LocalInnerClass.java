//33. Write a java program to use Local Inner Class.

public class U3_33_LocalInnerClass
{
    void show()
    {
        class Inner
        {
            void display()
            {
                System.out.println("This is Local Inner Class");
            }
        }

        Inner obj = new Inner();
        obj.display();
    }

    public static void main(String args[])
    {
        U3_33_LocalInnerClass obj = new U3_33_LocalInnerClass();
        obj.show();
    }
}
