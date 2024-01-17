package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that reads the following information and prints a payroll statement:
        Employee’s name (e.g., Smith)
        Number of hours worked in a week (e.g., 10)
        Hourly pay rate (e.g., 9.75)
        Federal tax withholding rate (e.g., 20%)
        State tax withholding rate (e.g., 9%)
 */

public class Payroll
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in Employee Information.
        System.out.print("\nEnter Employee Name: ");
        String employeeName = input.nextLine();

        System.out.print("\nEnter Number of hours worked: ");
        int numberOfHoursWorked = input.nextInt();

        System.out.print("\nEnter hourly pay rate : $ ");
        double hourlyPayRate = input.nextDouble();

        System.out.print("\nEnter Federal tax withholding rate (e.g., 20%): ");
        double federalTaxWithholdingRate = input.nextDouble();

        System.out.print("\nEnter State tax withholding rate (e.g., 20%): ");
        double stateTaxWithholdingRate = input.nextDouble();

        // Calculates employee's gross pay.
        double grossPay =hourlyPayRate * numberOfHoursWorked;

        // Calculates employee's Federal withholding.
        double federalWithholding = federalTaxWithholdingRate / 100 * grossPay;

        // Calculates employee's State withholding.
        double stateWithholding = stateTaxWithholdingRate / 100 * grossPay;

        // Calculates the total tax deductions.
        double totalDeduction = federalWithholding + stateWithholding;

        // Calculates employee's Net pay.
        double netPay = grossPay - totalDeduction;

        // Displays the result.
        System.out.printf("\nEmployee Name: %s\nHours Worked: %d\nPay Rate: $ %.2f\nGross Pay: $ %.2f\nDeductions\n\t" +
                "Federal Withholding: $ %.2f\n\tState Withholding: $ %.2f\n\tTotal Deduction: $ %.2f\nNet Pay: $ %.2f\n",
                employeeName, numberOfHoursWorked, hourlyPayRate, grossPay, federalWithholding, stateWithholding,
                totalDeduction, netPay);
    }
}
