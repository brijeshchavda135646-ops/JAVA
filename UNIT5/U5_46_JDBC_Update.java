//46. Write a JDBC program to Update data into Oracle Table.

import java.sql.*;

public class U5_46_JDBC_Update
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

            String sql = "update student set marks=90 where id=1";
            st.executeUpdate(sql);

            System.out.println("Record updated successfully");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
