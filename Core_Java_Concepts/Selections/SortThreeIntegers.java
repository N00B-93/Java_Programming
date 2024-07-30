package Core_Java_Concepts.Selections;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter three integers
    and display the integers in decreasing order.
 */

public class SortThreeIntegers
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter three numbers to be sorted in descending order.
        System.out.print("\nEnter three integers separated by space: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Displays the result in descending order.
        if (number1 >= number2 && number1 >= number3 && number2 >= number3)
            System.out.println("\nThe numbers sorted in descending order are: " + number1 + " " + number2 + " " + number3);
        else if (number1 >= number3 && number1 >= number2 && number3 >= number2)
            System.out.println("\nThe numbers sorted in descending order are: " + number1 + " " + number3 + " " + number2);
        else if (number2 >= number1 && number2 >= number3 && number1 >= number3)
            System.out.println("\nThe numbers sorted in descending order are: " + number2 + " " + number1 + " " + number3);
        else if (number2 >= number3 && number2 >= number1 && number3 >= number1)
            System.out.println("\nThe numbers sorted in descending order are: " + number2 + " " + number3 + " " + number1);
        else if (number3 >= number2 && number3 >= number1 && number2 >= number1)
            System.out.println("\nThe numbers sorted in descending order are: " + number3 + " " + number2 + " " + number1);
        else if (number3 >= number1 && number3 >= number2 && number1 >= number2)
            System.out.println("\nThe numbers sorted in descending order are: " + number3 + " " + number1 + " " + number2);
    }
}
