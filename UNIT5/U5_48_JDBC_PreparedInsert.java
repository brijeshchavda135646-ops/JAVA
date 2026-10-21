//48. Write a JDBC program to Insert Records Into Oracle Table Using Prepared Statement.

import java.sql.*;
import java.util.Scanner;

public class U5_48_JDBC_PreparedInsert
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc = new Scanner(System.in);

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:xe",
                "system",
                "password");

            String sql = "insert into student values(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            System.out.print("Enter ID : ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Marks : ");
            int marks = sc.nextInt();

            ps.setInt(1,id);
            ps.setString(2,name);
            ps.setInt(3,marks);

            ps.executeUpdate();

            System.out.println("Record inserted successfully");

            con.close();
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
