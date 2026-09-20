//26. Write a java program to use Throw Keyword.

public class U3_26_Throw
{
    public static void main(String args[])
    {
        int age = 15;

        if(age<18)
        {
            throw new ArithmeticException("Age is less than 18");
        }
        else
        {
            System.out.println("Eligible");
        }
    }
}
