package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter values for a, b, and c and displays
    the result based on the discriminant. If the discriminant is positive, two roots are displayed.
    If the discriminant is 0, one root is displayed. Otherwise, display “The equation has no real roots”.
 */
public class QuadraticEquation
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in the value of a, b, c.
        System.out.print("\nInput the values of the coefficient a, b, c separated by space: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Calculates the discriminant.
        double discriminant = Math.pow(b, 2) - (4 * a * c);

        // Calculates the roots.
        double root1 = (-b + Math.sqrt(discriminant)) / (2.0 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2.0 * a);

        // Displays the root based on the nature of the discriminant.
        if (discriminant > 0)
            System.out.printf("\nThe roots are: %.2f and %.2f\n", root1, root2);
        else if (discriminant == 0)
            System.out.printf("\nThe root is %.2f\n", root1);
        else
            System.out.println("\nThe equation has no real roots!");
    }
}
