//36. Write a java program to display different calendar information using calendar class.

import java.util.Calendar;

public class U3_36_CalendarInfo
{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();

        System.out.println("Year : " + c.get(Calendar.YEAR));
        System.out.println("Month : " + (c.get(Calendar.MONTH)+1));
        System.out.println("Day : " + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("Hour : " + c.get(Calendar.HOUR));
        System.out.println("Minute : " + c.get(Calendar.MINUTE));
        System.out.println("Second : " + c.get(Calendar.SECOND));
    }
}
