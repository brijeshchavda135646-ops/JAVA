//28. Write a java program to implement custom exception.

class MyException extends Exception
{
    MyException(String message)
    {
        super(message);
    }
}

public class U3_28_CustomException
{
    public static void main(String args[])
    {
        try
        {
            int age = 15;

            if(age<18)
            {
                throw new MyException("Age is less than 18");
            }

            System.out.println("Eligible");
        }
        catch(MyException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
