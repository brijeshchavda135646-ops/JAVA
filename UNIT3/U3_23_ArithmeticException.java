//23. Write a java program to implement Arithmetic Exception.

public class U3_23_ArithmeticException
{
    public static void main(String args[])
    {
        try
        {
            int a = 10;
            int b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception occurred");
        }
    }
}
