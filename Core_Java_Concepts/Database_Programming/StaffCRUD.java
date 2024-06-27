package Database_Programming;

import java.sql.*;
import java.util.Scanner;

public class StaffCRUD
{

    public static Connection connection;
    public static Statement statement;
    public static PreparedStatement preparedStatement;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        while (true)
        {
            System.out.println("\nWhat would you like to do?\n");
            System.out.print("""
                    1. Add Staff
                    2. Search Staff
                    3. Update Staff Details
                    4. Delete Staff Details
                    5. Show All Staff
                    6. Exit
                    """);

            System.out.print("\nSelect an Option: ");
            String option = input.nextLine();
            try
            {
                switch (option)
                {
                    case "1":
                        addStaff();
                        System.out.printf("\nWould you like to continue? ('y' for yes 'n' for no): ");
                        char choice = input.nextLine().charAt(0);
                        if (choice == 'y')
                            break;
                        else
                        {
                            System.out.println("\nExiting...");
                            System.exit(0);
                        }
                    case "2":
                        searchStaff();
                        System.out.printf("\nWould you like to continue? ('y' for yes 'n' for no): ");
                        choice = input.nextLine().charAt(0);
                        if (choice == 'y')
                            break;
                        else
                        {
                            System.out.println("\nExiting...");
                            System.exit(0);
                        }
                    case "3":
                        updateStaffDetails();
                        System.out.printf("\nWould you like to continue? ('y' for yes 'n' for no): ");
                        choice = input.nextLine().charAt(0);
                        if (choice == 'y')
                            break;
                        else
                        {
                            System.out.println("\nExiting...");
                            System.exit(0);
                        }
                    case "4":
                        deleteStaffDetails();
                        System.out.printf("\nWould you like to continue? ('y' for yes 'n' for no): ");
                        choice = input.nextLine().charAt(0);
                        if (choice == 'y')
                            break;
                        else
                        {
                            System.out.println("\nExiting...");
                            System.exit(0);
                        }
                    case "5":
                        showAllStaff();
                        System.out.printf("\nWould you like to continue? ('y' for yes 'n' for no): ");
                        choice = input.nextLine().charAt(0);
                        if (choice == 'y')
                            break;
                        else
                        {
                            System.out.println("\nExiting...");
                            System.exit(0);
                        }
                    case "6":
                        System.out.println("\nExiting...");
                        System.exit(0);
                    default:
                        System.out.println("\nInvalid Input, Try Again.");
                        break;
                }
            }
            catch (Exception ex)
            {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void addStaff() throws Exception
    {
        Scanner input = new Scanner(System.in);

        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/staffdb",
                "root", "blackviking");

        System.out.print("\nEnter your StaffID: ");
        String id = input.nextLine();

        System.out.print("\nEnter your Last Name: ");
        String lastName = input.nextLine();

        System.out.print("\nEnter your First Name: ");
        String firstName = input.nextLine();

        System.out.print("\nEnter Sex(M, F): ");
        char sex = input.nextLine().charAt(0);

        System.out.print("\nEnter Address: ");
        String address = input.nextLine();

        System.out.print("\nEnter City: ");
        String city = input.nextLine();

        System.out.print("\nEnter State: ");
        String state = input.nextLine();

        System.out.print("\nEnter Telephone Number: ");
        String telephoneNumber = input.nextLine();

        System.out.print("\nEnter Email: ");
        String email = input.nextLine();

        String sqlQuery = "INSERT INTO Staff(ID, Last_Name, First_Name, Sex, Address, City, State, Telephone, Email) " +
                "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        preparedStatement = connection.prepareStatement(sqlQuery);
        preparedStatement.setString(1, id);
        preparedStatement.setString(2, firstName);
        preparedStatement.setString(3, lastName);
        preparedStatement.setString(4, String.valueOf(sex));
        preparedStatement.setString(5, address);
        preparedStatement.setString(6, city);
        preparedStatement.setString(7, state);
        preparedStatement.setString(8, telephoneNumber);
        preparedStatement.setString(9, email);

        int rows = preparedStatement.executeUpdate();

        if (rows == 1)
        {
            System.out.printf("\n%s Added successfully\n", (firstName + " " + lastName));
        }
        else
        {
            System.out.printf("\n%s not Added!\n", (firstName + lastName));
        }

        connection.close();
        preparedStatement.close();
    }

    public static void searchStaff() throws Exception
    {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/staffdb",
                "root", "blackviking");
        Scanner input = new Scanner(System.in);

        System.out.printf("\nEnter StaffID: ");
        String staffID = input.nextLine();

        String sqlQuery = "SELECT * FROM Staff WHERE ID = ?";

        preparedStatement = connection.prepareStatement(sqlQuery);

        preparedStatement.setString(1, staffID);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next())
        {
            System.out.println("\nRecord found!");
        }
        else
        {
            System.out.println("\nRecord not found, Try again.");
            connection.close();
            preparedStatement.close();
            resultSet.close();
            return;
        }

        System.out.printf("\nStaffID: %s\n", resultSet.getString(1));
        System.out.printf("Full Name: %s\n", resultSet.getString(2) + " " +
                    resultSet.getString(3));
        System.out.printf("Sex: %s\n", resultSet.getString(4));
        System.out.printf("Address: %s\n", resultSet.getString(5));
        System.out.printf("City: %s\n", resultSet.getString(6));
        System.out.printf("State: %s\n", resultSet.getString(7));
        System.out.printf("Phone Number: %s\n", resultSet.getString(8));
        System.out.printf("Email: %s\n", resultSet.getString(9));

        connection.close();
        preparedStatement.close();
        resultSet.close();
    }
    public static void updateStaffDetails() throws Exception
    {
        Scanner input = new Scanner(System.in);
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/staffdb",
                "root", "blackviking");

        System.out.println("\nWhat would you like to update?");
        System.out.print("""
                            1. Address
                            2. City
                            3. State
                            4. Phone Number
                            5. Email
                            6. Exit
                        """);

        System.out.print("\nSelect an Option: ");
        String choice = input.nextLine();

        switch (choice)
        {
            case "1":
                System.out.printf("\nEnter your StaffID: ");
                String id = input.nextLine();
                System.out.print("\nEnter your new Address: ");
                String newAddress = input.nextLine();
                String sqlQuery = "UPDATE Staff SET Address = ? WHERE ID = ?";
                preparedStatement = connection.prepareStatement(sqlQuery);
                preparedStatement.setString(1, newAddress);
                preparedStatement.setString(2, id);
                int row = preparedStatement.executeUpdate();
                if (row == 1)
                    System.out.printf("\nAddress updated to %s\n", newAddress);
                else
                    System.out.println("\nAddress not updated, Try again.");
                break;
            case "2":
                System.out.printf("\nEnter your StaffID: ");
                id = input.nextLine();
                System.out.printf("\nEnter the new City: ");
                String newCity = input.nextLine();
                sqlQuery = "UPDATE Staff SET City = ? WHERE ID = ?";
                preparedStatement = connection.prepareStatement(sqlQuery);
                preparedStatement.setString(1, newCity);
                preparedStatement.setString(2, id);
                row = preparedStatement.executeUpdate();
                if (row == 1)
                    System.out.printf("\nCity updated to %s\n", newCity);
                else
                    System.out.println("\nCity not updated, Try again.");
                break;
            case "3":
                System.out.printf("\nEnter your StaffID: ");
                id = input.nextLine();
                System.out.printf("\nEnter the new State: ");
                String newState = input.nextLine();
                sqlQuery = "UPDATE Staff SET State = ? WHERE ID = ?";
                preparedStatement = connection.prepareStatement(sqlQuery);
                preparedStatement.setString(1, newState);
                preparedStatement.setString(2, id);
                row = preparedStatement.executeUpdate();
                if (row == 1)
                    System.out.printf("\nState updated to %s\n", newState);
                else
                    System.out.println("\nState not updated, Try again.");
                break;
            case "4":
                System.out.printf("\nEnter your StaffID: ");
                id = input.nextLine();
                System.out.printf("\nEnter the new Phone Number: ");
                String newPhone = input.nextLine();
                sqlQuery = "UPDATE Staff SET Telephone = ? WHERE ID = ?";
                preparedStatement = connection.prepareStatement(sqlQuery);
                preparedStatement.setString(1, newPhone);
                preparedStatement.setString(2, id);
                row = preparedStatement.executeUpdate();
                if (row == 1)
                    System.out.printf("\nPhone Number updated to %s\n", newPhone);
                else
                    System.out.println("\nPhone Number not updated, Try again.");
                break;
            case "5":
                System.out.printf("\nEnter your StaffID: ");
                id = input.nextLine();
                System.out.printf("\nEnter the new Email Address: ");
                String newEmail = input.nextLine();
                sqlQuery = "UPDATE Staff SET Email = ? WHERE ID = ?";
                preparedStatement = connection.prepareStatement(sqlQuery);
                preparedStatement.setString(1, newEmail);
                preparedStatement.setString(2, id);
                row = preparedStatement.executeUpdate();
                if (row == 1)
                    System.out.printf("\nEmail updated to %s\n", newEmail);
                else
                    System.out.println("\nEmail not updated, Try again.");
                break;
            case "6":
                return;
            default:
                System.out.println("\nInvalid Input, Try Again!");
                break;
        }

        connection.close();
        preparedStatement.close();
    }

    public static void deleteStaffDetails() throws Exception
    {
        Scanner input = new Scanner(System.in);
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/staffdb",
                "root", "blackviking");

        System.out.printf("\nEnter StaffID: ");
        String staffID = input.nextLine();

        String sqlQuery = "DELETE FROM Staff WHERE ID = ?";

        preparedStatement = connection.prepareStatement(sqlQuery);

        preparedStatement.setString(1, staffID);

        int row = preparedStatement.executeUpdate();

        if (row == 1)
            System.out.println("\nStaff Details deleted successfully!");
        else
            System.out.println("\nStaff Details not deleted, Try again.");

        connection.close();
        preparedStatement.close();
        return;
    }

    public static void showAllStaff() throws Exception
    {
        Scanner input = new Scanner(System.in);
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/staffdb",
                "root", "blackviking");

        String sqlQuery = "SELECT * FROM Staff";
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        System.out.println("\nRetrieving Data...");

        while (resultSet.next())
        {
            System.out.printf("\nStaffID: %s\n", resultSet.getString(1));
            System.out.printf("Full Name: %s\n", resultSet.getString(2) + " " +
                    resultSet.getString(3));
            System.out.printf("Sex: %s\n", resultSet.getString(4));
            System.out.printf("Address: %s\n", resultSet.getString(5));
            System.out.printf("City: %s\n", resultSet.getString(6));
            System.out.printf("State: %s\n", resultSet.getString(7));
            System.out.printf("Phone Number: %s\n", resultSet.getString(8));
            System.out.printf("Email: %s\n", resultSet.getString(9));
        }
    }
}
