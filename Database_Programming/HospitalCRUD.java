package Database_Programming;

import java.sql.*;
import java.util.Scanner;

public class HospitalCRUD
{
    public static Statement statement;
    public static Connection connection;
    // Creates a Scanner Object.
    public static Scanner input = new Scanner(System.in);
    public static PreparedStatement preparedStatement;
    public static void main(String[] args)
    {
        try
        {
            while (true)
            {
                System.out.print("\nWhat would you like to do?\n");
                System.out.print("""
                        1. Add Hospital
                        2. Search Hospital
                        3. Update Hospital Details.
                        4. Delete Hospital.
                        5. Show All Hospital.
                        6. Exit 
                        """);
                System.out.printf("\nSelect Option: ");
                String choice = input.nextLine();

                switch (choice)
                {
                    case "1":
                        addHospital();
                        System.out.printf("\nWould you like to continue? ('y' for yes 'n' for no): ");
                        char option = input.next().charAt(0);
                        if (option == 'y')
                            break;
                        else
                        {
                            System.out.println("\nExiting...");
                            System.exit(0);
                        }
                }
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Adds a Hospital to the Hospital Database.
     *
     * @throws SQLException the sql exception
     */
    public static void addHospital() throws SQLException
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root",
                    "blackviking");

            String sqlQuery = "INSERT INTO Hospital(Hospital_ID, Hospital_Name, Bed_Count) values(?, ?, ?)";

            System.out.printf("\nEnter Hospital Name: ");
            String hospitalName = input.nextLine();

            System.out.printf("\nEnter Hospital ID: ");
            int hospital_ID = input.nextInt();

            System.out.printf("\nEnter Hospital Bed Count: ");
            int hospitalBedCount = input.nextInt();

            preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, hospital_ID);
            preparedStatement.setString(2, hospitalName);
            preparedStatement.setInt(3, hospitalBedCount);

            int rows = preparedStatement.executeUpdate();

            if (rows == 1)
                System.out.printf("\n%s Successfully Added!", hospitalName);
            else
                System.out.printf("\n%s not Added, Try again!", hospitalName);
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
        finally
        {
            preparedStatement.close();
            connection.close();
        }
    }
}
