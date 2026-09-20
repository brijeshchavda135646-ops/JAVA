//24. Write a java program to use Finally block in Exception Handling.

public class U3_24_Finally
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
        finally
        {
            System.out.println("Finally block executed");
        }
    }
}
