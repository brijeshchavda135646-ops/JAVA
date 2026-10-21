//44. Write a JDBC program to Insert data into Oracle Table.

import java.sql.*;

public class U5_44_JDBC_Insert
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

            String sql = "insert into student values(1,'Mihir',80)";
            st.executeUpdate(sql);

            System.out.println("Record inserted successfully");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
