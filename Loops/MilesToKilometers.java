package Loops;

/*
        This is a program that converts distance
        from Miles to Kilometers and displays the result in a table.
 */

public class MilesToKilometers
{
    public static void main(String[] args)
    {
        System.out.println("\nMiles\t\tKilometers");
        for (int miles = 1; miles <= 10; miles++)
            // Converts Miles to Kilometer by multiplying Miles by 1.609 and displaying the result.
            System.out.printf("%d\t\t%14.2f\n", miles, miles * 1.609);
    }
}
