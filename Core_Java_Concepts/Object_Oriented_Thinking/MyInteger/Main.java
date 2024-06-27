package Object_Oriented_Thinking.MyInteger;

import java.util.Scanner;
import java.util.Random;

/*
    This is a program that prompts th user to enter an integer greater than 1 and then uses this value to test all
    the methods available in the MyInteger class.
 */

public class Main
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input =new Scanner(System.in);

        // Creates a Random Object.
        Random random = new Random();

        // Prompts the user to enter an integer value greater than 0.
        System.out.printf("\nEnter an Integer > 0: ");
        int number = input.nextInt();

        // Displays an error message and terminates the program if the user enters a number less than 1.
        if (number < 1)
        {
            System.out.println("\nInvalid input, Use an Integer >= 1.");
            System.exit(1);
        }

        // Creates a MyInteger Object.
        MyInteger myInteger = new MyInteger(number);

        // Tests all the methods in the MyInteger class.
        System.out.printf("\nValue: %d\n", myInteger.getValue());
        System.out.printf("\nIs %d even? %b\n", myInteger.getValue(), myInteger.isEven());
        System.out.printf("\nIs %d odd? %b\n", myInteger.getValue(), myInteger.isOdd());
        System.out.printf("\nIs %d prime? %b\n", myInteger.getValue(), myInteger.isPrime());

        // Generates a random number between 1 and 1000 to test the static isEven, isOdd and isPrime methods.
        int randomNumber = random.nextInt(1, 1001);
        System.out.printf("\nIs %d even? %b\n", randomNumber, MyInteger.isEven(randomNumber));
        System.out.printf("\nIs %d odd? %b\n", randomNumber, MyInteger.isOdd(randomNumber));
        System.out.printf("\nIs %d prime? %b\n", randomNumber, MyInteger.isPrime(randomNumber));

        System.out.printf("\nIs %d == %d? %b\n", myInteger.getValue(), randomNumber, myInteger.equals(randomNumber));

        // Creates another MyInteger Object to test equality.
        MyInteger newInteger = new MyInteger(64);
        System.out.printf("\nIs %d == %d? %b\n", myInteger.getValue(), newInteger.getValue(), myInteger.equals(newInteger));

        // Converts a numeric String into an int.
        String stringInteger = "255";
        System.out.printf("\n%s converted to int is: %d\n", stringInteger, MyInteger.parseInt(stringInteger));

    }
}
