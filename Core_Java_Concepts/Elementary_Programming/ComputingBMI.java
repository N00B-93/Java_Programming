package Core_Java_Concepts.Elementary_Programming;

import java.util.Scanner;

/*
    Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and
    dividing by the square of your height in meters. This is a program that prompts the
    user to enter a weight in pounds and height in inches and displays the BMI.
 */

public class ComputingBMI
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Reads in weight.
        System.out.print("\nEnter weight in pounds: ");
        double weight = input.nextDouble();

        // Reads in height.
        System.out.print("\nEnter height in inches: ");
        double height = input.nextDouble();

        // Converts the weight to kilograms and height to meters and then calculate the BMI.
        double bmi = (weight * 0.45359) / (Math.pow(height * 0.0254, 2));

        // Displays the result.
        System.out.printf("\nBMI is: %.2f\n", bmi);
    }
}
