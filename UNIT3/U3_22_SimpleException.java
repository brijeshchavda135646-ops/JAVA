//22. Write a java program to implement simple exception handling.

public class U3_22_SimpleException
{
    public static void main(String args[])
    {
        try
        {
            int a = 10/0;
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println("Exception occurred");
        }
    }
}
