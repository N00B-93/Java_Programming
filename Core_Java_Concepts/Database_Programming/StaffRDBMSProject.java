package Database_Programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StaffRDBMSProject
{
    public static Connection connection;
    public static Statement statement;

    public static void main(String[] args)
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/staffdb",
                    "root", "blackviking");

            String sqlQuery = "CREATE TABLE IF NOT EXISTS Staff(ID VARCHAR(9) PRIMARY KEY NOT NULL, " +
                    "Last_Name VARCHAR(20), First_Name VARCHAR(20), Sex CHAR(1), Address VARCHAR(100), City VARCHAR(20)," +
                    " State VARCHAR(20), Telephone CHAR(11), Email VARCHAR(30))";

            statement = connection.createStatement();

            boolean status = statement.execute(sqlQuery);

            if (!status)
                System.out.println("\nTable created successfully");
            else
                System.out.println("\nTable not created!");
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        } finally
        {
            try
            {
                if (connection != null)
                    connection.close();
                if (statement != null)
                    statement.close();
            }
            catch (SQLException ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }
}
