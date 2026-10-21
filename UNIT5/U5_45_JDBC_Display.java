//45. Write a JDBC program to Display data into Oracle Table.

import java.sql.*;

public class U5_45_JDBC_Display
{
    public static void main(String args[])
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system",
                "password");

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select * from student");

            while(rs.next())
            {
                System.out.println("ID : " + rs.getInt(1));
                System.out.println("Name : " + rs.getString(2));
                System.out.println("Marks : " + rs.getInt(3));
                System.out.println();
            }

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
