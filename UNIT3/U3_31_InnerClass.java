//31. Write a java program to use simple inner class in your program.

public class U3_31_InnerClass
{
    int a = 10;

    class Inner
    {
        void show()
        {
            System.out.println("Value of a : " + a);
        }
    }

    public static void main(String args[])
    {
        U3_31_InnerClass obj = new U3_31_InnerClass();
        U3_31_InnerClass.Inner in = obj.new Inner();
        in.show();
    }
}
