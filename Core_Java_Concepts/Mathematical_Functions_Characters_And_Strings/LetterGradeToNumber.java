package Mathematical_Functions_Characters_And_Strings;

import java.util.Scanner;

/*
    This is a program that prompts the user to enter a
    letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
    1, or 0.
 */

public class LetterGradeToNumber
{
    public static void main(String[] args)
    {
        // Creates a Scanner Object.
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter a letter grade.
        System.out.printf("\nEnter a Grade(A, B, C, D, or F): ");
        char letterGrade = input.next().charAt(0);

        // Checks if the grade is valid and terminates the program if not.
        if (!"ABCDF".contains(letterGrade + ""))
        {
            System.out.printf("\n%c is an Invalid Grade!\n", letterGrade);
            System.exit(1);
        }

        if (letterGrade == 'F')
            // Displays 0 if the grade is 'F'.
            System.out.println("\nThe numeric value for grade 'F' is: 0");
        else
            // Displays the result.
            System.out.printf("\nThe numeric value for grade '%c' is: %d\n", letterGrade, 'F' - letterGrade - 1);
    }
}
