//37. Write a java program to add, subtract a days/month into current date and time.

import java.util.Calendar;

public class U3_37_AddSubtractDate
{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();

        System.out.println("Current Date : " + c.getTime());

        c.add(Calendar.DAY_OF_MONTH,5);
        System.out.println("After 5 Days : " + c.getTime());

        c.add(Calendar.MONTH,1);
        System.out.println("After 1 Month : " + c.getTime());

        c.add(Calendar.DAY_OF_MONTH,-5);
        System.out.println("After Subtracting 5 Days : " + c.getTime());
    }
}
