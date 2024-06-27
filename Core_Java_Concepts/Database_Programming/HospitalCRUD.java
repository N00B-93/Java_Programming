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
    public static ResultSet resultSet;
    public static void main(String[] args)
    {
        try
        {
            while (true)
            {
                System.out.print("\nWhat would you like to do?\n");
                System.out.print("""
                        1. Add Hospital.
                        2. Search Hospital.
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
                    case "2":
                        searchHospital();
                        System.out.printf("\nWould you like to continue? ('y' for yes 'n' for no): ");
                        option = input.next().charAt(0);
                        if (option == 'y')
                            break;
                        else
                        {
                            System.out.println("\nExiting...");
                            System.exit(0);
                        }
                    case "3":
                        updateHospitalDetails();
                        System.out.printf("\nWould you like to continue? ('y' for yes 'n' for no): ");
                        option = input.next().charAt(0);
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

    public static void searchHospital() throws SQLException
    {
        try
        {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root",
                    "blackviking");

            String sqlQuery = "SELECT * FROM Hospital WHERE Hospital_ID = ?";

            System.out.printf("\nEnter Hospital ID: ");
            int hospitalID = input.nextInt();

            preparedStatement = connection.prepareStatement(sqlQuery);

            preparedStatement.setInt(1, hospitalID);

            resultSet = preparedStatement.executeQuery();

            if (resultSet.next())
            {
                System.out.println("\nHospital Record Found!");
            }
            else
            {
                System.out.println("\nHospital Record not Found!");
                connection.close();
                //resultSet.close();
                preparedStatement.close();
                return;
            }

            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            int bedCount = resultSet.getInt(3);

            System.out.println("\n\t\tHospital Details.");

            System.out.printf("Hospital ID: %d\n", id);
            System.out.printf("Hospital Name: %s\n", name);
            System.out.printf("Bed Count: %d\n", bedCount);

        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    public static void updateHospitalDetails() throws  SQLException
    {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb", "root",
                "blackviking");

        System.out.print("""
                            1. Update Hospital Name
                            2. Update Hospital Bed Count       
                """);
        System.out.printf("\nSelect an Option: ");
        String choice = input.nextLine();

        switch (choice)
        {
            case "1":
                System.out.printf("\nEnter New Hospital Name: ");
                String newName = input.nextLine();

                System.out.printf("\nEnter Hospital_ID: ");
                int hospitalID = input.nextInt();

                String sqlQuery = "UPDATE Hospital SET Hospital_Name = ? WHERE Hospital_ID = ?";

                preparedStatement = connection.prepareStatement(sqlQuery);

                preparedStatement.setString(1, newName);
                preparedStatement.setInt(2, hospitalID);

                int rows = preparedStatement.executeUpdate(sqlQuery);

                if (rows == 1)
                    System.out.printf("\nHospital Name successfully changed to %s\n", newName);
                else
                {
                    System.out.printf("\nHospital Name Update not successful.");
                    connection.close();
                    preparedStatement.close();
                    return;
                }
                break;
        }
    }
}
