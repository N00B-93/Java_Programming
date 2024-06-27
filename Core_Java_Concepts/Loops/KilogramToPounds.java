package Loops;

/*
    This is a program that converts weight
    from kilograms to pounds and displays the result in a table.
 */

public class KilogramToPounds
{
    public static void main(String[] args)
    {
        System.out.println("\nKilogram\t\tPound");
        for (int kilogram = 1; kilogram < 200; kilogram += 2)
            // Converts kilogram to pounds by multiplying kilogram by 2.2 and displaying the result.
            System.out.printf("%d\t\t%13.2f\n", kilogram, kilogram * 2.2);
    }
}
