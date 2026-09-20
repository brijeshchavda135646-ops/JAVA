//25. Write a java program to use Multiple Catch Block.

public class U3_25_MultipleCatch
{
    public static void main(String args[])
    {
        try
        {
            int a[] = new int[2];
            a[5] = 10;
            int b = 10/0;
            System.out.println(b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index Exception");
        }
        catch(Exception e)
        {
            System.out.println("Exception");
        }
    }
}
