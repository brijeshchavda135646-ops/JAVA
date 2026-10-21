//47. Write a JDBC program to Delete data into Oracle Table.

import java.sql.*;

public class U5_47_JDBC_Delete
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

            String sql = "delete from student where id=1";
            st.executeUpdate(sql);

            System.out.println("Record deleted successfully");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
