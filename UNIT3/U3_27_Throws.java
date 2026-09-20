//27. Write a java program to use Throws Keyword.

public class U3_27_Throws
{
    static void check() throws ArithmeticException
    {
        int a = 10/0;
        System.out.println(a);
    }

    public static void main(String args[])
    {
        try
        {
            check();
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception handled");
        }
    }
}
