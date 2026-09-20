//29. Write a java program to implement Exception Propagation.

public class U3_29_ExceptionPropagation
{
    static void method1()
    {
        int a = 10/0;
        System.out.println(a);
    }

    static void method2()
    {
        method1();
    }

    static void method3()
    {
        try
        {
            method2();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception handled in method3");
        }
    }

    public static void main(String args[])
    {
        method3();
    }
}
