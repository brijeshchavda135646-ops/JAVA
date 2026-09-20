//30. Write a java program to implement Exception Chaining.

public class U3_30_ExceptionChaining
{
    public static void main(String args[])
    {
        try
        {
            Exception e = new Exception("Original Exception");
            Exception e2 = new Exception("New Exception",e);
            throw e2;
        }
        catch(Exception e)
        {
            System.out.println("Exception : " + e.getMessage());
            System.out.println("Cause : " + e.getCause());
        }
    }
}
