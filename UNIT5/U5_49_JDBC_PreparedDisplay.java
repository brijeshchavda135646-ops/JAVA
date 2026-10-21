//49. Write a JDBC program to Display Records Into Oracle Table Using Prepared Statement.

import java.sql.*;

public class U5_49_JDBC_PreparedDisplay
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

            String sql = "select * from student where id=?";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1,1);

            ResultSet rs = ps.executeQuery();

            while(rs.next())
            {
                System.out.println("ID : " + rs.getInt(1));
                System.out.println("Name : " + rs.getString(2));
                System.out.println("Marks : " + rs.getInt(3));
            }

            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
