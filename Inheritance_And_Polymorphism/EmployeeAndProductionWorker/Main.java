package Inheritance_And_Polymorphism.EmployeeAndProductionWorker;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner keyBoard = new Scanner(System.in);

        // Prompts the Production Worker to enter his/her details.
        System.out.printf("\nEnter Full Name: ");
        String fullName = keyBoard.nextLine();

        System.out.printf("\nEnter your ID(e.g. 000-X): ");
        String employeeID = keyBoard.next();

        // Checks  if the employeeID entered is valid.
        if (employeeID.length() != 5)
        {
            System.out.println("\nEmployeeID length must be 5 characters!");
            System.exit(2);
        }

        if (!isValidEmployeeID(employeeID))
        {
            System.out.println("""

                    Invalid Employee ID format!
                    Each digit of the first 3 numbers must be between 0 - 9
                    Last Character must be Uppercase between A - M
                    The separator in the middle must be '-'.""");
            System.exit(1);
        }

        System.out.printf("\nEnter Shift: (1 for 'Day' or 2 for 'Night'): ");
        int shift = keyBoard.nextInt();

        System.out.printf("\nEnter your Hourly Rate: $ ");
        double hourlyRate = keyBoard.nextDouble();

        // Creates a ProductionWorker Object.
        ProductionWorker productionWorker = new ProductionWorker(fullName, employeeID, shift, hourlyRate);

        // Displays the ProductionWorker's details.
        System.out.println("\n\t\tEmployee Details");
        System.out.println(productionWorker);
    }

    /**
     * Checks if a Production Worker's ID meets the required standard.
     *
     * @param employeeID The employee ID to be checked.
     * @return true if the ID meets the required standard, else false.
     */
    public static boolean isValidEmployeeID(String employeeID)
    {
        int numberPrefix = Integer.parseInt(employeeID.substring(0, 3));
        char lastCharacter = employeeID.charAt(4);
        char separator = employeeID.charAt(3);

        if (numberPrefix < 100 || numberPrefix > 999)
            return false;
        if (separator != '-')
             return false;
        return lastCharacter >= 'A' && lastCharacter <= 'M';
    }
}
