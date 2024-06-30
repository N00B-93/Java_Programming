package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
    Body Mass Index (BMI) is a measure of health based on height and weight. It can be calculated
    by taking your weight in kilograms and dividing it by the square of your height in
    meters. This is a program that prompts the user to enter a weight in pounds and height in feet and inches then
    displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254
    meters.
 */

public class ComputeAndInterpreteBMI
{
    public static void main(String[] args)
    {
        // Declares conversion constants.
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        final double FEET_TO_METERS = 0.305;

        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter weight in pounds.
        System.out.print("\nEnter weight in pounds: ");
        double weight = input.nextDouble();

        // Prompts the user to enter height in feet.
        System.out.print("\nEnter feet: ");
        double feet = input.nextDouble();

        // Prompts the user to enter height in inches.
        System.out.print("\nEnter inches: ");
        double inches = input.nextDouble();

        // Converts the weight and height from pounds and feet and inches to kilograms and meters.
        double weightInKg = weight * KILOGRAMS_PER_POUND;
        double inchesToMeters = inches * METERS_PER_INCH;
        double heightInMeters = feet * FEET_TO_METERS;

        // Calculates the new height.
        double height = inchesToMeters + heightInMeters;

        // Calculates the BMI.
        double bmi = weightInKg / Math.pow(height, 2);

        // Displays the user's status based on the calculated BMI.
        if (bmi < 18.5)
            System.out.println("\nUnderweight.");
        else if (18.5 <= bmi && bmi < 25.0)
            System.out.println("\nNormal.");
        else if (25.0 <= bmi && bmi < 30.0)
            System.out.println("\nOverweight.");
        else if (30.0 <= bmi)
            System.out.println("\nObese.");
    }
}
