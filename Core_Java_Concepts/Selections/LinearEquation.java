package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
    Cramer’s rule can be used to solve the following 2 x 2 system of linear equation:
            ax + by = e     x = ed - bf / ad - bc
            cx + dy = f     y = af - ec / ad - bc
    This is a program that prompts the user to enter a, b, c, d, e, and f and display the
    result. If ad – bc is 0, it reports that The equation has no solution.
 */

public class LinearEquation
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the values of the coefficients a, b, c, d, e, f.
        System.out.print("\nEnter the values of a, b, c, d, e, f separated by space: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        // Calculates the denominator
        double denominator = a * d - b * c;

        // Checks if the denominator is 0, informs the user that the equation has no real roots and exits the program.
        if (denominator == 0.0)
        {
            System.out.println("\nThe equation has no real roots.");
            System.exit(0);
        }

        // Calculates the values of x and y respectively.
        double x = (e * d - b * f) / denominator;
        double y = (a * f - e * c) / denominator;

        // Displays the result.
        System.out.printf("\nx = %.2f and y = %.2f\n", x, y);
    }
}
