//50. Write a JDBC program to Update and Delete Records Into Oracle Table Using Prepared Statement.

import java.sql.*;

public class U5_50_JDBC_PreparedUpdateDelete
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

            String sql1 = "update student set marks=? where id=?";
            PreparedStatement ps1 = con.prepareStatement(sql1);

            ps1.setInt(1,95);
            ps1.setInt(2,1);

            ps1.executeUpdate();

            System.out.println("Record updated successfully");

            String sql2 = "delete from student where id=?";
            PreparedStatement ps2 = con.prepareStatement(sql2);

            ps2.setInt(1,1);

            ps2.executeUpdate();

            System.out.println("Record deleted successfully");

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
