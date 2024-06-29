package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    This is a program that reads the subtotal
    and the gratuity rate, then computes the gratuity and total
 */

public class GratuityAndTotal
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the sub-total.
        System.out.print("\nEnter the sub-total: ");
        double subTotal = input.nextDouble();

        // Reads in the gratuity rate.
        System.out.print("\nEnter the gratuity rate: ");
        double gratuityRate = input.nextDouble();

        // Calculates the total.
        double total = subTotal + subTotal * gratuityRate / 100.0;

        // Calculates the gratuity.
        double gratuity =  subTotal * gratuityRate / 100.0;

        // Displays the result.
        System.out.printf("\nThe gratuity is $ %.2f and the total is $ %.2f\n", gratuity, total);
    }
}
