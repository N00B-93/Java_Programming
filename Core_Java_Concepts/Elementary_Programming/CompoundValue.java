package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    This is a program  that prompts the user to enter a monthly saving amount and displays the account value after the sixth month
    giving that the annual interest rate is 3.75%.
 */

public class CompoundValue
{
    public static void main(String[] args)
    {
        // Annual interest rate.
        double annualInterestRate = 0.0375;

        // Constant to hold the monthly interest rate.
        final double MONTHLY_INTEREST_RATE = annualInterestRate / 12.0;

        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // Prompts the user to enter the monthly saving amount.
        System.out.printf("\nEnter the monthly saving amount: $ ");
        double monthlySavingAmount = console.nextDouble();

        // Calculates the account value from the first month to the sixth month.
        double amountAfterFirstMonth = monthlySavingAmount * (1 + MONTHLY_INTEREST_RATE);
        double amountAfterSecondMonth = (monthlySavingAmount + amountAfterFirstMonth) * (1 + MONTHLY_INTEREST_RATE);
        double amountAfterThirdMonth = (monthlySavingAmount + amountAfterSecondMonth) * (1 + MONTHLY_INTEREST_RATE);
        double amountAfterFourthMonth = (monthlySavingAmount + amountAfterThirdMonth) * (1 + MONTHLY_INTEREST_RATE);
        double amountAfterFifthMonth = (monthlySavingAmount + amountAfterFourthMonth) * (1 + MONTHLY_INTEREST_RATE);
        double amountAfterSixthMonth = (monthlySavingAmount + amountAfterFifthMonth) * (1 + MONTHLY_INTEREST_RATE);

        // Displays the account value after the sixth month
        System.out.printf("\nThe account value after the sixth month is: $ %.2f\n", amountAfterSixthMonth);
    }
}
