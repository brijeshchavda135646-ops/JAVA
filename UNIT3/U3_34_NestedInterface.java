//34. Write a java program to use Nested Interface.

class Outer
{
    interface Inner
    {
        void show();
    }
}

public class U3_34_NestedInterface implements Outer.Inner
{
    public void show()
    {
        System.out.println("This is Nested Interface");
    }

    public static void main(String args[])
    {
        U3_34_NestedInterface obj = new U3_34_NestedInterface();
        obj.show();
    }
}
