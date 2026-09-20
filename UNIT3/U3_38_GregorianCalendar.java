//38. Write a java program to use Gregorian calendar to display calendar information.

import java.util.GregorianCalendar;

public class U3_38_GregorianCalendar
{
    public static void main(String args[])
    {
        GregorianCalendar c = new GregorianCalendar();

        System.out.println("Year : " + c.get(GregorianCalendar.YEAR));
        System.out.println("Month : " + (c.get(GregorianCalendar.MONTH)+1));
        System.out.println("Day : " + c.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println("Day of Year : " + c.get(GregorianCalendar.DAY_OF_YEAR));
        System.out.println("Week of Year : " + c.get(GregorianCalendar.WEEK_OF_YEAR));
    }
}
