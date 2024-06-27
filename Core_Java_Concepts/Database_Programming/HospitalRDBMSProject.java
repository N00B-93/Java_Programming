package Database_Programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HospitalRDBMSProject
{
    public static void main(String[] args)
    {
        try
        {
            // Creates a Connection.
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospitaldb",
                    "root", "blackviking");

            // Creates a Statement reference.
            Statement statement;

            // Creates a table for Hospitals.
            String sqlQuery1 = "CREATE TABLE IF NOT EXISTS Hospital(Hospital_ID INTEGER PRIMARY KEY NOT NULL, " +
                    "Hospital_Name TEXT, Bed_Count INTEGER)";
            statement = connection.prepareStatement(sqlQuery1);
            statement.execute(sqlQuery1);

            // Creates a table for Doctors.
            String sqlQuery2 = "CREATE TABLE IF NOT EXISTS Doctor(Doctor_ID INTEGER PRIMARY KEY NOT NULL, Doctor_name TEXT, " +
                    "Hospital_ID INTEGER, Joining_date TEXT, Speciality TEXT, Salary DOUBLE, Years_Of_Experience INTEGER,"
                   + "FOREIGN KEY(Hospital_ID) REFERENCES Hospital(Hospital_ID))";
            statement = connection.prepareStatement(sqlQuery2);
            statement.execute(sqlQuery2);

            System.out.println("\nHospitals and Doctors tables created successfully!");

            // Closes the statement and connection objects.
            statement.close();
            connection.close();
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
