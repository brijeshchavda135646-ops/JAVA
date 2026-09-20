//35. Write a java program to display date in different format.

import java.util.Date;
import java.text.SimpleDateFormat;

public class U3_35_DateFormat
{
    public static void main(String args[])
    {
        Date date = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");

        System.out.println("Format 1 : " + f1.format(date));
        System.out.println("Format 2 : " + f2.format(date));
        System.out.println("Format 3 : " + f3.format(date));
    }
}
