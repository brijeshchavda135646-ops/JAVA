//32. Write a java program to use Static Inner Class.

public class U3_32_StaticInnerClass
{
    static int a = 20;

    static class Inner
    {
        void show()
        {
            System.out.println("Value of a : " + a);
        }
    }

    public static void main(String args[])
    {
        U3_32_StaticInnerClass.Inner obj = new U3_32_StaticInnerClass.Inner();
        obj.show();
    }
}
