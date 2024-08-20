package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
    A software company sells a package that retails for $99. Quantity discounts are given according to the following table.
                        Quantity        Discount
                        10–19           20%
                        20–49           30%
                        50–99           40%
                        100 or more     50%
    This is a program that asks for the number of units sold and computes the total cost of the purchase.
 */

public class SoftwareSales
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner console = new Scanner(System.in);

        // Constant representing the final retail price.
        final double UNIT_RETAIL_PRICE = 99;
        double discountRate = 0.0;

        // Prompts the user to enter the units sold.
        System.out.printf("\nEnter the number of units of software sold: ");
        int unitSold = console.nextInt();

        // Closes the Scanner Object.
        console.close();

        // Validates the number of unit of software sold entered by the user.
        if (unitSold < 1)
        {
            System.out.println("\nError: Unit sold should be at least 1, Try again.");
            System.exit(1);
        }

        // Calculates the cost.
        double cost = UNIT_RETAIL_PRICE * unitSold;

        // Determines the discount rate depending on the number of units of software sold.
        if (unitSold >= 10 && unitSold <= 19)
            discountRate = 0.20;
        else if (unitSold >= 20 && unitSold <= 49)
            discountRate = 0.30;
        else if (unitSold >= 50 && unitSold <= 99)
            discountRate = 0.40;
        else if (unitSold >= 100)
            discountRate = 0.50;

        // Calculates the cost after discount.
        double costAfterDiscount = cost - cost * discountRate;

        // Displays the cost of the software purchased after discount.
        System.out.printf("\nThe total cost of purchasing %d units of software after a %.2f%% discount rate is: $%.2f\n",
                    unitSold, discountRate * 100, costAfterDiscount);
    }
}
